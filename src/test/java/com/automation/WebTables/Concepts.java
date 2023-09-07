package com.automation.WebTables;

public class Concepts {
	
	//table[@class = 'dataTable'] -> represents the whole table
	//table[@class = 'dataTable']/thead -> represents the header row
	//table[@class = 'dataTable']/thead/tr -> represents the header row but this one is more accurate
	//table[@class = 'dataTable']/thead/tr/th[1] -> first col of the header row
	//table[@class = 'dataTable']/thead/tr/th[2] - 2nd col of the header row
	
	//table[@class = 'dataTable']/tbody -> this represents the webtable without the header row
	//table[@class = 'dataTable']/tbody/tr -> this represents all rows of the webtable without the header row
	//table[@class = 'dataTable']/tbody/tr[1] -> this represents the first row of the webtable
	//table[@class = 'dataTable']/tbody/tr[1]/td[1] -this represents col1 of row1
	//table[@class = 'dataTable']/tbody/tr[1]/td[2] -> this represents col2 of row1
	
	//table[@class = 'dataTable']/tbody/tr/td[1] -> this represents all values in 1st column
	//table[@class = 'dataTable']/tbody/tr/td[2] -> this represents all values in 2nd column

}
