package de.re.easymodbus.datatypes;

public enum Parity 
{
	NONE (0),
	EVEN (2),
	ODD(1);
	
	private int value;
    
    private Parity(int value) 
    {
        this.value = value;
    }
    
    public int getValue() 
    {
        return value;
    }
}
