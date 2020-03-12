package utils;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import utils.exceptions.convertir_tabla_exepcion;

public class convertir_datos_tabla_cucumber {

    private final List<List<String>> rows;
    private final Map<String, String> flatMap;
    private final List<String> headers;

    public static Map<String, String> toMap(DataTable dataTable) {
        return new convertir_datos_tabla_cucumber(dataTable).convertToMap();
    }

    private convertir_datos_tabla_cucumber(DataTable dataTable) {
        this.rows = dataTable.raw();
        this.headers = this.rows.get(0);
        this.flatMap = new LinkedHashMap<>();
    }

    private  Map<String, String> convertToMap() {
        if(this.rows.size() < 2){
            throw new convertir_tabla_exepcion("A DataTable should have atleast one header and one data row");
        }
        if(this.rows.size() == 2) { // in case of only header followed by one single data row
            addOnlySingleRowDataToMap();
            return Collections.unmodifiableMap(flatMap);
        }

        addAllDataRowsToMap();
        return Collections.unmodifiableMap(flatMap);
    }

    private void addAllDataRowsToMap() {
        Iterator iter = this.rows.iterator();
        int rowCnt = 0;
        while(iter.hasNext()) {
            List<String> row = (List)iter.next();
            validRowCheck(row);
            addRowDataToMap(rowCnt, row);
            rowCnt++;
        }
    }

    private void addOnlySingleRowDataToMap() {
        List<String> singleDataRow = this.rows.get(1); // extract the last or second row from data table in case of single data row
        validRowCheck(singleDataRow);
        for(int colCnt = 0; colCnt < headers.size(); colCnt++) {
            String key = headers.get(colCnt);
            String value = singleDataRow.get(colCnt);
            flatMap.put(key, value);
        }
    }

    private void addRowDataToMap(int rowCnt, List<String> row) {
        for(int colCnt = 0; colCnt < headers.size(); colCnt++) {
            String key = headers.get(colCnt) + "[" + rowCnt + "]";
            String value = row.get(colCnt);
            flatMap.put(key, value);
        }
    }

    private void validRowCheck(List<String> row) {
        if (row.size() != headers.size()) {
            throw new convertir_tabla_exepcion("A DataTable record has missing column data");
        }
    }


}
