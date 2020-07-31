package Application.Report;

import Application.Entity.NodeBase;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;



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
        Sheet sheet = wb.createSheet("Application/Report");

        Row row1 = sheet.createRow(1);
        Row row2 = sheet.createRow(2);
        Row row3 = sheet.createRow(3);
        Row row4 = sheet.createRow(4);
        Row row5 = sheet.createRow(5);
        Row row6 = sheet.createRow(6);
        Row row7 = sheet.createRow(7);
        Row row8 = sheet.createRow(8);
        Row row9 = sheet.createRow(9);
        Row row10 = sheet.createRow(10);
        Row row11 = sheet.createRow(11);
        Row row12 = sheet.createRow(12);
        Row row13 = sheet.createRow(13);
        Row row14 = sheet.createRow(14);
        Row row15 = sheet.createRow(15);
        Row row16 = sheet.createRow(16);
        Row row17 = sheet.createRow(17);
        Row row18 = sheet.createRow(18);
        Row row19 = sheet.createRow(19);
        Row row20 = sheet.createRow(20);
        Row row21 = sheet.createRow(21);
        Row row22 = sheet.createRow(22);
        Row row23 = sheet.createRow(23);


        HSSFCellStyle style = ((HSSFWorkbook) wb).createCellStyle();
        style.setAlignment(HorizontalAlignment.CENTER);
        style.setBorderTop(BorderStyle.MEDIUM);
        style.setBorderBottom(BorderStyle.MEDIUM);
        style.setBorderLeft(BorderStyle.MEDIUM);
        style.setBorderRight(BorderStyle.MEDIUM);


        Cell cell01 = row1.createCell(0);
        cell01.setCellValue("Id");
        cell01.setCellStyle(style);

        Cell cell02 = row2.createCell(0);
        cell02.setCellValue("DateTime");
        cell02.setCellStyle(style);

        Cell cell03 = row3.createCell(0);
        cell03.setCellValue("Ip_Address");
        cell03.setCellStyle(style);

        Cell cell04 = row4.createCell(0);
        cell04.setCellValue("Errored Blocks Side1");
        cell04.setCellStyle(style);

        Cell cell05 = row5.createCell(0);
        cell05.setCellValue("Errored Blocks Side2");
        cell05.setCellStyle(style);

        Cell cell06 = row6.createCell(0);
        cell06.setCellValue("Errored Seconds Side1");
        cell06.setCellStyle(style);

        Cell cell07 = row7.createCell(0);
        cell07.setCellValue("Errored Seconds Side2");
        cell07.setCellStyle(style);

        Cell cell08 = row8.createCell(0);
        cell08.setCellValue("Severely Errored Seconds Side1");
        cell08.setCellStyle(style);

        Cell cell09 = row9.createCell(0);
        cell09.setCellValue("Severely Errored Seconds Side2");
        cell09.setCellStyle(style);

        Cell cell010 = row10.createCell(0);
        cell010.setCellValue("Background Block Errors Side1");
        cell010.setCellStyle(style);

        Cell cell011 = row11.createCell(0);
        cell011.setCellValue("Background Block Errors Side2");
        cell011.setCellStyle(style);

        Cell cell012 = row12.createCell(0);
        cell012.setCellValue("esr[%] Side1");
        cell012.setCellStyle(style);

        Cell cell013 = row13.createCell(0);
        cell013.setCellValue("esr[%] Side2");
        cell013.setCellStyle(style);

        Cell cell014 = row14.createCell(0);
        cell014.setCellValue("sers[%] Side1");
        cell014.setCellStyle(style);

        Cell cell015 = row15.createCell(0);
        cell015.setCellValue("sers[%] Side2");
        cell015.setCellStyle(style);

        Cell cell016 = row16.createCell(0);
        cell016.setCellValue("bber[%] Side1");
        cell016.setCellStyle(style);

        Cell cell017 = row17.createCell(0);
        cell017.setCellValue("bber[%] Side2");
        cell017.setCellStyle(style);

        Cell cell018 = row18.createCell(0);
        cell018.setCellValue("Available Time Side1");
        cell018.setCellStyle(style);

        Cell cell019 = row19.createCell(0);
        cell019.setCellValue("Available Time Side2");
        cell019.setCellStyle(style);

        Cell cell020 = row20.createCell(0);
        cell020.setCellValue("Unavailable Time Side1");
        cell020.setCellStyle(style);

        Cell cell021 = row21.createCell(0);
        cell021.setCellValue("Unavailable Time Side2");
        cell021.setCellStyle(style);

        Cell cell022 = row22.createCell(0);
        cell022.setCellValue("Nmr dB Side1");
        cell022.setCellStyle(style);

        Cell cell023 = row23.createCell(0);
        cell023.setCellValue("Nmr dB Side2");
        cell023.setCellStyle(style);






        for (int i = 0; i != nodeBaseList.size(); i++) {

            Cell cell1 = row1.createCell(i+1);
            cell1.setCellValue(nodeBaseList.get(i).getId());
            cell1.setCellStyle(style);

            Cell cell2 = row2.createCell(i+1);
            cell2.setCellValue(nodeBaseList.get(i).getLocalDateTime().toString());
            cell2.setCellStyle(style);

            Cell cell3 = row3.createCell(i+1);
            cell3.setCellValue(nodeBaseList.get(i).getIpNode());
            cell3.setCellStyle(style);


            Cell cell4 = row4.createCell(i+1);
            cell4.setCellValue(nodeBaseList.get(i).getErroredBlocksValueSide1());
            cell4.setCellStyle(style);


            Cell cell5 = row5.createCell(i+1);
            if(nodeBaseList.get(i).getErroredBlocksValueSide2()==null){
                cell5.setCellValue("default");
                cell5.setCellStyle(style);
            }else {
                cell5.setCellValue(nodeBaseList.get(i).getErroredBlocksValueSide2());
                cell5.setCellStyle(style);
            }



            Cell cell6 = row6.createCell(i+1);
            cell6.setCellValue(nodeBaseList.get(i).getErroredSecondValueSide1());
            cell6.setCellStyle(style);


            Cell cell7 = row7.createCell(i+1);
            if(nodeBaseList.get(i).getErroredSecondValueSide2()==null){
                cell7.setCellValue("default");
                cell7.setCellStyle(style);
            }else {
                cell7.setCellValue(nodeBaseList.get(i).getErroredSecondValueSide2());
                cell7.setCellStyle(style);
            }


            Cell cell8 = row8.createCell(i+1);
            cell8.setCellValue(nodeBaseList.get(i).getSeverelyErroredSecondsValueSide1());
            cell8.setCellStyle(style);



            Cell cell9 = row9.createCell(i+1);
            if(nodeBaseList.get(i).getSeverelyErroredSecondsValueSide2()==null){
                cell9.setCellValue("default");
                cell9.setCellStyle(style);
            }else {
                cell9.setCellValue(nodeBaseList.get(i).getSeverelyErroredSecondsValueSide2());
                cell9.setCellStyle(style);
            }


            Cell cell10 = row10.createCell(i+1);
            cell10.setCellValue(nodeBaseList.get(i).getBackgroundBlockErrorsValueSide1());
            cell10.setCellStyle(style);


            Cell cell11 = row11.createCell(i+1);
            if(nodeBaseList.get(i).getBackgroundBlockErrorsValueSide2()==null){
                cell11.setCellValue("default");
                cell11.setCellStyle(style);
            }else {
                cell11.setCellValue(nodeBaseList.get(i).getBackgroundBlockErrorsValueSide2());
                cell11.setCellStyle(style);
            }


            Cell cell12 = row12.createCell(i+1);
            cell12.setCellValue(nodeBaseList.get(i).getEsrValueSide1());
            cell12.setCellStyle(style);


            Cell cell13 = row13.createCell(i+1);
            if(nodeBaseList.get(i).getEsrValueSide2()==null){
                cell13.setCellValue("default");
                cell13.setCellStyle(style);
            }else {
                cell13.setCellValue(nodeBaseList.get(i).getEsrValueSide2());
                cell13.setCellStyle(style);
            }


            Cell cell14 = row14.createCell(i+1);
            if(nodeBaseList.get(i).getSesrValueSide1()==null) {
                cell14.setCellValue("default");
                cell14.setCellStyle(style);

            }else {
                cell14.setCellValue(nodeBaseList.get(i).getSesrValueSide1());
                cell14.setCellStyle(style);
            }


            Cell cell15 = row15.createCell(i+1);
            if(nodeBaseList.get(i).getSesrValueSide2()==null){
                cell15.setCellValue("default");
                cell15.setCellStyle(style);
            }else {
                cell15.setCellValue(nodeBaseList.get(i).getSesrValueSide2());
                cell15.setCellStyle(style);
            }


            Cell cell16 = row16.createCell(i+1);
            cell16.setCellValue(nodeBaseList.get(i).getBberValueSide1());
            cell16.setCellStyle(style);


            Cell cell17 = row17.createCell(i+1);
            if(nodeBaseList.get(i).getBberValueSide2()==null){
                cell17.setCellValue("default");
                cell17.setCellStyle(style);
            }else {
                cell17.setCellValue(nodeBaseList.get(i).getBberValueSide2());
                cell17.setCellStyle(style);
            }

            Cell cell18 = row18.createCell(i+1);
            cell18.setCellValue(nodeBaseList.get(i).getAvailableTimeValueSide1());
            cell18.setCellStyle(style);

            Cell cell19 = row19.createCell(i+1);
            if(nodeBaseList.get(i).getAvailableTimeValueSide2()==null){
                cell19.setCellValue("default");
                cell19.setCellStyle(style);
            }else {
                cell19.setCellValue(nodeBaseList.get(i).getAvailableTimeValueSide2());
                cell19.setCellStyle(style);
            }

            Cell cell20 = row20.createCell(i+1);
            cell20.setCellValue(nodeBaseList.get(i).getUnavailableTimeValueSide1());
            cell20.setCellStyle(style);

            Cell cell21 = row21.createCell(i+1);
            if(nodeBaseList.get(i).getUnavailableTimeValueSide2()==null){
                cell21.setCellValue("default");
                cell21.setCellStyle(style);
            }else {
                cell21.setCellValue(nodeBaseList.get(i).getUnavailableTimeValueSide2());
                cell21.setCellStyle(style);
            }

            Cell cell22 = row22.createCell(i+1);
            cell22.setCellValue(nodeBaseList.get(i).getNmrValueSide1());
            cell22.setCellStyle(style);

            Cell cell23 = row23.createCell(i+1);
            if(nodeBaseList.get(i).getNmrValueSide2()==null){
                cell23.setCellValue("default");
                cell23.setCellStyle(style);
            }else {
                cell23.setCellValue(nodeBaseList.get(i).getNmrValueSide2());
                cell23.setCellStyle(style);
            }

        }



            for (int i = 0; i<=sheet.getRow(1).getPhysicalNumberOfCells(); i++) {
                sheet.autoSizeColumn(i);
            }



            try {
                fos = new FileOutputStream(dataTime.replace(':', '-') + ".xls");
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
