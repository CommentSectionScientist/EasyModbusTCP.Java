package de.re.easymodbus.datatypes;

public enum StopBits 
{
	ONE (1),
	ONE_POINT_FIVE (3),
	TWO (2);
	
	private int value;
    
    private StopBits(int value) 
    {
        this.value = value;
    }
    
    public int getValue() 
    {
        return value;
    }
}
