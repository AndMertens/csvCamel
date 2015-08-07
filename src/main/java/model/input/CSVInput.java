package model.input;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

/**
 * Created by lanhnguyen on 8/6/2015.
 */

@CsvRecord(separator = ",")
public class CSVInput {

    @DataField(pos = 1)
    private String column1;

    @DataField(pos = 2)
    private String column2;

    @DataField(pos = 3)
    private String column3;

    public String getColumn1() {
        return column1;
    }

    public String getColumn2() {
        return column2;
    }

    public String getColumn3() {
        return column3;
    }

    public void setColumn1(String column1) {
        this.column1 = column1;
    }

    public void setColumn2(String column2) {
        this.column2 = column2;
    }

    public void setColumn3(String column3) {
        this.column3 = column3;
    }

    @Override
    public String toString() {
        return "CSVInput{" +
                "column1='" + column1 + '\'' +
                ", column2='" + column2 + '\'' +
                ", column3='" + column3 + '\'' +
                '}';
    }
}
