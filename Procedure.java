public class Procedure {
    
    private String procedureName;
    private String procedureDate;
    private String practitioner;
    private double charges;
    
    public Procedure() {
    }

    // Constructor with name and date
    public Procedure(String procedureName, String procedureDate) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
    }

    public Procedure(String procedureName, String procedureDate, String practitioner, double charges) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitioner = practitioner;
        this.charges = charges;
    }

	// accessors
    public String getProcedureName() {
    	return procedureName; 
    }
    public String getProcedureDate() {
    	return procedureDate; 
    }
    public String getPractitioner() {
    	return practitioner; 
    }
    public double getCharges() {
    	return charges; 
    }

    // mutators
    public void setProcedureName(String procedureName) {
    	this.procedureName = procedureName; 
    }
    public void setProcedureDate(String procedureDate) {
    	this.procedureDate = procedureDate; 
    }
    public void setPractitioner(String practitioner) {
    	this.practitioner = practitioner; 
    }
    public void setCharges(double charges) {
    	this.charges = charges; 
    }

    // toString method
    public String toString() {
    return "\tProcedure: " + procedureName + "\n" +
           "\tProcedureDate=" + procedureDate + "\n" +
           "\tPractitioner=" + practitioner + "\n" +
           "\tCharge=" + String.format("%.2f", charges) + "\n";
}




}