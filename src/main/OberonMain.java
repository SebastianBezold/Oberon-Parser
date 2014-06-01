package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import oberon.OberonLexer;
import oberon.OberonParser;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;

public class OberonMain {

	public static void main(String[] args) {
		ANTLRInputStream inputStream = null;
		try {
			inputStream = new ANTLRInputStream(
					new FileInputStream(args[0]));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		OberonLexer lexer = new OberonLexer(inputStream);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		OberonParser parser = new OberonParser(tokens);
		OberonParser.module_return result = null;
		try {
			result = parser.module();
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		
		CommonTree tree = (CommonTree) result.getTree();
		System.out.println(tree.toStringTree());
				
		DOTTreeGenerator dotGenerator = new DOTTreeGenerator();
				
		try {
			PrintWriter dotWriter = new PrintWriter(new File("test.dot"));
			dotWriter.write(dotGenerator.toDOT(tree).toString());
			dotWriter.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	
	}

}
