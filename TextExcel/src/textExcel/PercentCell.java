package textExcel;

public class PercentCell extends RealCell {

	public PercentCell(String input) {
		super(input);
		
	}

	@Override
	public String abbreviatedCellText() {
		
		return null;
	}

	@Override
	public String fullCellText() {
		return (getDoubleValue() + "");
	}

}
