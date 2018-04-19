package textExcel;

public class FormulaCell extends RealCell{

	public FormulaCell(String input) {
		super(input);
	
	}

	@Override
	public String abbreviatedCellText() {
		return null;
	}
	
	public double getDoubleValue() {
		
	}

	@Override
	public String fullCellText() {
		return numberString;
	}

}
