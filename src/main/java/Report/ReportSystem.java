package Report;

import Entity.NodeBase;
import Service.ExchangeServiceTable;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class ReportSystem {


    public List<NodeBase> getNodeBaseList() {
        return nodeBaseList;
    }

    public void setNodeBaseList(List<NodeBase> nodeBaseList) {
        this.nodeBaseList = nodeBaseList;
    }

    List<NodeBase> nodeBaseList;

    FileOutputStream fos;

    public void reportSystem() {



        Workbook wb = new HSSFWorkbook();
        Sheet sheet = wb.createSheet("Report");

        Row row0 = sheet.createRow(1);
        Cell cell0 = row0.createCell(1);
        cell0.setCellValue("IP_Address");
        sheet.setColumnWidth(1,4500);

        Row row1 = sheet.createRow(2);
        Cell cell1 = row1.createCell(1);
        cell1.setCellValue(nodeBaseList.get(0).getErroredBlocksName());
        sheet.setColumnWidth(2,4500);

        Row row2 = sheet.createRow(3);
        Cell cell2 = row2.createCell(1);
        cell2.setCellValue(nodeBaseList.get(0).getErroredSecondsName());
        sheet.setColumnWidth(3,4500);






        try {
            fos = new FileOutputStream("report.xls");

            try {
                ((HSSFWorkbook) wb).write(fos);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
