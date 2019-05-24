package identificacaoCodeSmellJS;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.v4.parse.ANTLRLexer;
import org.antlr.v4.parse.ANTLRParser;

public class Main {
	public static void main(String argss[]) throws RecognitionException {
		String src = "true && (false || true && (true || false))";
	    ANTLRLexer lexer = new ANTLRLexer(new ANTLRStringStream(src));
	    ANTLRParser parser = new ANTLRParser(new CommonTokenStream(lexer));
	    CommonTree tree = (CommonTree)parser.parserRule().getTree();
	    DOTTreeGenerator gen = new DOTTreeGenerator();
	    //StringTemplate st = gen.toDOT(tree);
	    String teste = gen.toString();
	    
	    System.out.println(teste);
	}
}
