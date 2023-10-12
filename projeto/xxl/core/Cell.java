package xxl.core;

import java.io.IOException;

import xxl.core.Content;
import xxl.core.exception.AsIntException;
import xxl.core.exception.AsStringException;
import xxl.core.exception.UnrecognizedEntryException;

public class Cell{
    private int _row;
    private int _column;
    private Content _content;

    public Cell(int row, int column){
        _row = row;
        _column = column;
        _content = null;
    }
    public String toString(){
        String str;
        try{
            str = _content.asString();
        }
        catch(AsStringException ex)
        {
            return null;
        }
        return str;
    }
    void setContent(Content c){
        _content = c;
    }
    Literal value(){
        return _content.value();
    }

}