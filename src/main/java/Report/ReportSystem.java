package Report;

import Entity.NodeBase;
import Service.ExchangeServiceTable;
import Service.ServiceDateTime;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static java.lang.String.format;

public class ReportSystem {

    public FileOutputStream getFos() {
        return fos;
    }

    public void setFos(FileOutputStream fos) {
        this.fos = fos;
    }

    String dataTime;

    public String getDataTime() {
        return dataTime;
    }

    public void setDataTime(String dataTime) {
        this.dataTime = dataTime;
    }

    public List<NodeBase> getNodeBaseList() {
        return nodeBaseList;
    }

    public void setNodeBaseList(List<NodeBase> nodeBaseList) {
        this.nodeBaseList = nodeBaseList;
    }

    List<NodeBase> nodeBaseList;

    FileOutputStream fos;



    public Object reportSystem() {


        Workbook wb = new HSSFWorkbook();
        Sheet sheet = wb.createSheet("Report");

        Row row1 = sheet.createRow(1);

            Cell cell1 = row1.createCell(1);
            cell1.setCellValue("Parametr");

            Cell cell2 = row1.createCell(2);
            cell2.setCellValue("ОП Георгиевск");

            Cell cell3 = row1.createCell(3);
            cell3.setCellValue("НУП7(Side2)");

            Cell cell4 = row1.createCell(4);
            cell4.setCellValue("НУП7(Side1)");

            Cell cell5 = row1.createCell(5);
            cell5.setCellValue("НУП6(Side2)");

            Cell cell6 = row1.createCell(6);
            cell6.setCellValue("НУП6(Side1)");

            Cell cell7 = row1.createCell(7);
            cell7.setCellValue("НУП5(Side2)");

            Cell cell8 = row1.createCell(8);
            cell8.setCellValue("НУП5(Side1)");

        for (int i=0; i<sheet.getRow(1).getPhysicalNumberOfCells();i++) {
            sheet.autoSizeColumn(i);
        }



        Row row2 = sheet.createRow(2);

        Cell cell21 = row2.createCell(1);
        cell21.setCellValue("IP_Address");

        Cell cell22 = row2.createCell(2);
        cell22.setCellValue(nodeBaseList.get(0).getIpNode());

        Cell cell23 = row2.createCell(3);
        cell23.setCellValue(nodeBaseList.get(1).getIpNode());

        Cell cell24 = row2.createCell(4);
        cell24.setCellValue(nodeBaseList.get(1).getIpNode());

        Cell cell25 = row2.createCell(5);
        cell25.setCellValue(nodeBaseList.get(2).getIpNode());

        Cell cell26 = row2.createCell(6);
        cell26.setCellValue(nodeBaseList.get(2).getIpNode());

        Cell cell27 = row2.createCell(7);
        cell27.setCellValue(nodeBaseList.get(3).getIpNode());

        Cell cell28 = row2.createCell(8);
        cell28.setCellValue(nodeBaseList.get(3).getIpNode());

        for (int i=0; i<sheet.getRow(2).getPhysicalNumberOfCells();i++) {
            sheet.autoSizeColumn(i);
        }


        Row row3 = sheet.createRow(3);

        Cell cell31 = row3.createCell(1);
        cell31.setCellValue("Errored blocks");

        Cell cell32 = row3.createCell(2);
        cell32.setCellValue(nodeBaseList.get(0).getErroredBlocksValueSide1());

        Cell cell33 = row3.createCell(3);
        cell33.setCellValue(nodeBaseList.get(1).getErroredBlocksValueSide2());

        Cell cell34 = row3.createCell(4);
        cell34.setCellValue(nodeBaseList.get(1).getErroredBlocksValueSide1());

        Cell cell35 = row3.createCell(5);
        cell35.setCellValue(nodeBaseList.get(2).getErroredBlocksValueSide2());

        Cell cell36 = row3.createCell(6);
        cell36.setCellValue(nodeBaseList.get(2).getErroredBlocksValueSide1());

        Cell cell37 = row3.createCell(7);
        cell37.setCellValue(nodeBaseList.get(3).getErroredBlocksValueSide2());

        Cell cell38 = row3.createCell(8);
        cell38.setCellValue(nodeBaseList.get(3).getErroredBlocksValueSide1());

        for (int i=0; i<sheet.getRow(3).getPhysicalNumberOfCells();i++) {
            sheet.autoSizeColumn(i);
        }








        try {
            fos = new FileOutputStream( dataTime.replace(':','-')+".xls");
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
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


        return fos;
    }

}
