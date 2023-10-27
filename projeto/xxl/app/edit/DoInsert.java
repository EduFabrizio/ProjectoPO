package xxl.app.edit;

import java.util.List;

import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
import xxl.app.exception.InvalidCellRangeException;
import xxl.app.exception.OurCommandException;
import xxl.core.Cell;
import xxl.core.NullContent;
import xxl.core.Range;
import xxl.core.Spreadsheet;
import xxl.core.exception.IncorrectBinaryFunctionException;
import xxl.core.exception.IncorrectIntervalFunctionException;
// FIXME import classes
import xxl.core.exception.UnrecognizedEntryException;

/**
 * Class for inserting data.
 */
class DoInsert extends Command<Spreadsheet> {

  DoInsert(Spreadsheet receiver) {
    super(Label.INSERT, receiver);
    addStringField("Gama_Inserir", Message.address());
    addStringField("conteudo", Message.contents());
  }
  
  @Override
  protected final void execute() throws CommandException {
   try{
	
    Range gamaInserirRange = _receiver.buildRange(stringField("Gama_Inserir"));
    // int row = gamaInserirRange.getBeginRow(), col = gamaInserirRange.getBeginColumn();
	
    // while (row != gamaInserirRange.getEndRow() || col != gamaInserirRange.getEndColumn()){
	// 	{
	// 		_receiver.insertContent(row, col, stringField("conteudo"));
	// 	}
	// 	if (row == gamaInserirRange.getEndRow())
	// 		col++;
	// 	if (col == gamaInserirRange.getEndColumn())
	// 		row++;
    // }
	List<Cell> cells= gamaInserirRange.copyRange();

	for (Cell cell : cells) {
		_receiver.insertContent(cell.getRow(), cell.getColumn(), stringField("conteudo"));
	}
  }
  catch(UnrecognizedEntryException|InvalidCellRangeException|IncorrectBinaryFunctionException|IncorrectIntervalFunctionException e){
    throw new OurCommandException(""+e);
  }
}

}
