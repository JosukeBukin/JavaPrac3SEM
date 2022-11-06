package parser;


import exceptions.FormatParserException;
import expression.TripleExpression;

public interface Parser {
    TripleExpression parse(String expression) throws FormatParserException;
}