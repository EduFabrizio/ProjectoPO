package xxl.app.main;

import pt.tecnico.uilib.forms.Form;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
import xxl.app.exception.FileOpenFailedException;
import xxl.core.Calculator;

/**
 * Open a new file.
 */
class DoNew extends Command<Calculator> {

  DoNew(Calculator receiver) {
    super(Label.NEW, receiver);
    addIntegerField("linhas", Message.lines());
    addIntegerField("colunas", Message.columns());
  }
  
  @Override
  protected final void execute() throws CommandException {
    int linhas = integerField("linhas");
    int colunas = integerField("colunas");
    try {
      _receiver.createNewSpreadsheet(linhas, colunas);
    } catch (Exception e) {
      throw new FileOpenFailedException(e);
    } 
  }
}
