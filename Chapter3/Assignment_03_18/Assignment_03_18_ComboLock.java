public class Assignment_03_18_ComboLock {

	private Assignment_03_18_Combination combo;

	public Assignment_03_18_ComboLock() {
		this.combo = new Assignment_03_18_Combination(0, 0, 0);
	}

	public Assignment_03_18_ComboLock(int _num1, int _num2, int _num3) {
		this.combo = new Assignment_03_18_Combination(_num1, _num2, _num3);
	}

	public boolean open(int _num1, int _num2, int _num3) {
		return this.combo.eval(_num1, _num2, _num3);
	}

	public boolean changeCombo(int _num1, int _num2, int _num3, int _newNum1, int _newNum2, int _newNum3) {
		
		if (this.open(_num1, _num2, _num3))
		{
			this.combo = new Assignment_03_18_Combination(_newNum1, _newNum2, _newNum3);
			return true;
		}
		return false;
	}

}
