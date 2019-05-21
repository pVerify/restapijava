package estimateCalculation;

public class EstimateCalculationResponse {
    

private String patientResponsibility;

private String copay;

private String amountPayable;

private String deductibleRemaining;

private String outOfPocketRemaining;

private String estimatedAllowable;

private String coInsAmount;

private SelectedCPTs[] selectedCPTs;

private String coInsPercentage;

public String getPatientResponsibility ()
{
return patientResponsibility;
}

public void setPatientResponsibility (String patientResponsibility)
{
this.patientResponsibility = patientResponsibility;
}

public String getCopay ()
{
return copay;
}

public void setCopay (String copay)
{
this.copay = copay;
}

public String getAmountPayable ()
{
return amountPayable;
}

public void setAmountPayable (String amountPayable)
{
this.amountPayable = amountPayable;
}

public String getDeductibleRemaining ()
{
return deductibleRemaining;
}

public void setDeductibleRemaining (String deductibleRemaining)
{
this.deductibleRemaining = deductibleRemaining;
}

public String getOutOfPocketRemaining ()
{
return outOfPocketRemaining;
}

public void setOutOfPocketRemaining (String outOfPocketRemaining)
{
this.outOfPocketRemaining = outOfPocketRemaining;
}

public String getEstimatedAllowable ()
{
return estimatedAllowable;
}

public void setEstimatedAllowable (String estimatedAllowable)
{
this.estimatedAllowable = estimatedAllowable;
}

public String getCoInsAmount ()
{
return coInsAmount;
}

public void setCoInsAmount (String coInsAmount)
{
this.coInsAmount = coInsAmount;
}

public SelectedCPTs[] getSelectedCPTs ()
{
return selectedCPTs;
}

public void setSelectedCPTs (SelectedCPTs[] selectedCPTs)
{
this.selectedCPTs = selectedCPTs;
}

public String getCoInsPercentage ()
{
return coInsPercentage;
}

public void setCoInsPercentage (String coInsPercentage)
{
this.coInsPercentage = coInsPercentage;
}

@Override
public String toString()
{
return "ClassPojo [patientResponsibility = "+patientResponsibility+", copay = "+copay+", amountPayable = "+amountPayable+", deductibleRemaining = "+deductibleRemaining+", outOfPocketRemaining = "+outOfPocketRemaining+", estimatedAllowable = "+estimatedAllowable+", coInsAmount = "+coInsAmount+", selectedCPTs = "+selectedCPTs+", coInsPercentage = "+coInsPercentage+"]";
}
}
