package xxl.core;

import java.io.IOException;

import javax.swing.text.AbstractDocument.Content;

import java.io.FileNotFoundException;

import xxl.core.exception.ImportFileException;
import xxl.core.exception.MissingFileAssociationException;
import xxl.core.exception.UnavailableFileException;
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
        return _content.asString();
    }
    void setContent(Content c){
        _content = c;
    }
    Literal value(){
        return _content.value();
    }

}