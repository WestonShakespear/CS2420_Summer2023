public class wshakespear_Assignment_03_18_ComboLock {

	private wshakespear_Assignment_03_18_Combination combo;

	/**
     * This class represents a 3 digit combination lock, initilized to 0,0,0
     * @author Weston Shakespear
     **/
	public wshakespear_Assignment_03_18_ComboLock() {
		this.combo = new wshakespear_Assignment_03_18_Combination(0, 0, 0);
	}

	/**
     * This class represents a 3 digit combination lock
     * @author Weston Shakespear
	 * @param _num1 First digit
	 * @param _num2 Second digit
	 * @param _num3 Third digit
     **/
	public wshakespear_Assignment_03_18_ComboLock(int _num1, int _num2, int _num3) {
		this.combo = new wshakespear_Assignment_03_18_Combination(_num1, _num2, _num3);
	}

	/**
     * This method tries to open the combination lock
     * @author Weston Shakespear
	 * @param _num1 First test digit
	 * @param _num2 Second test digit
	 * @param _num3 Third test digit
	 * @return boolean Unlock status
     **/
	public boolean open(int _num1, int _num2, int _num3) {
		return this.combo.eval(_num1, _num2, _num3);
	}

	/**
     * This method changes the code, as long as the lock is unlocked
     * @author Weston Shakespear
	 * @param _num1 First test digit
	 * @param _num2 Second test digit
	 * @param _num3 Third test digit
	 * @param _newNum1 First new digit
	 * @param _newNum2 Second new digit
	 * @param _newNum3 Third new digit
	 * @return boolean Code changed status
     **/
	public boolean changeCombo(int _num1, int _num2, int _num3, int _newNum1, int _newNum2, int _newNum3) {
		
		if (this.open(_num1, _num2, _num3))
		{
			this.combo = new wshakespear_Assignment_03_18_Combination(_newNum1, _newNum2, _newNum3);
			return true;
		}
		return false;
	}

}



