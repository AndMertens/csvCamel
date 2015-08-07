package service;

import model.input.CSVInput;
import model.output.CSVOutput;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;

import java.util.Map;

/**
 * Created by LANH on 8/7/2015.
 */
public class MergeCSVProcessor implements Processor {
    public void process(Exchange exchange) throws Exception {
        Message in = exchange.getIn();
        Map<String, Object> body = (Map<String, Object>) in.getBody();

        CSVInput obj = (CSVInput) body.get("model.input.CSVInput");
        CSVOutput csvOutput = new CSVOutput();
        csvOutput.setColumn1(obj.getColumn1());
        Message out = exchange.getOut();
        out.setBody(csvOutput);
        exchange.setOut(out);
        System.out.println("colump1" + ", " + obj.getColumn1());
        //in.setBody(unmarshaledModels.get(CSVInput.class.getCano

    }
}
