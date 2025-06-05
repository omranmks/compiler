import HTML.classes.HTMLhtmlTag;
import HTML.gen.HTMLLexer;
import HTML.gen.HTMLParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import Angular.classes.Program;
import org.antlr.v4.runtime.tree.ParseTree;

import Angular.gen.AngularParser;
import Angular.gen.AngularLexer;

public class Main {
    public static void main(String[] args) throws Exception {
        SymbolTable st = new SymbolTable();
//        String source = System.getProperty("user.dir") + "\\AngularTests\\test1";
//        String source = System.getProperty("user.dir") + "\\AngularTests\\test2";
//        String source = System.getProperty("user.dir") + "\\AngularTests\\test3";
//        String source = System.getProperty("user.dir") + "\\AngularTests\\customTest1";
//        String source = System.getProperty("user.dir") + "\\AngularTests\\customTest2";
//        String source = System.getProperty("user.dir") + "\\AngularTests\\finalTest";
        String source = System.getProperty("user.dir") + "\\AngularTests\\newTest";
//        String source = System.getProperty("user.dir") + "\\AngularTests\\newTest2";
        CharStream input = CharStreams.fromFileName(source);
        AngularLexer angularLexer = new AngularLexer(input);
        CommonTokenStream angularTokens = new CommonTokenStream(angularLexer);
        AngularParser angularParser = new AngularParser(angularTokens);
        ParseTree angularTree = angularParser.program();
        AngularBaseVisitor angularBaseVisitor = new AngularBaseVisitor(st);
        Program program = (Program) angularBaseVisitor.visit(angularTree);
//        System.out.println("==========  Angular Program AST  ==========");
//        System.out.println(program);
//        System.out.println("==========  Angular Symbol Table ==========");

//        System.out.println("\n========== ========== ==========\n");

        String htmlSource = System.getProperty("user.dir") + "\\HtmlTests\\test1";
//        String htmlSource = System.getProperty("user.dir") + "\\HtmlTests\\test2";
//        String htmlSource = System.getProperty("user.dir") + "\\HtmlTests\\test3";
//        String htmlSource = System.getProperty("user.dir") + "\\HtmlTests\\test4";
//        String htmlSource = System.getProperty("user.dir") + "\\HtmlTests\\test5";
//        String htmlSource = System.getProperty("user.dir") + "\\HtmlTests\\finalTest";
        CharStream htmlInput = CharStreams.fromFileName(htmlSource);
        HTMLLexer htmlLexer = new HTMLLexer(htmlInput);
        CommonTokenStream htmlTokens = new CommonTokenStream(htmlLexer);
        HTMLParser htmlParser = new HTMLParser(htmlTokens);
        ParseTree tree = htmlParser.htmlTag();
        HTMLBaseVisitor htmlBaseVisitor = new HTMLBaseVisitor(st);
        HTMLhtmlTag htmlTag = (HTMLhtmlTag) htmlBaseVisitor.visit(tree);
//        System.out.println("==========  HTML Program AST  ==========");
//        System.out.println(htmlTag);
//        st.print();
        SemanticCheck sm = new SemanticCheck(st);
        sm.CheckErrors();
        return;
    }
}