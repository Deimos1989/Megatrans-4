package Application.Report;

import Application.Entity.ResultSurley;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;


public class ReportSystem {


    String dataTime;

    String pathServerDirectory;

    public String getPathServerDirectory() {
        return pathServerDirectory;
    }

    public void setPathServerDirectory(String pathServerDirectory) {
        this.pathServerDirectory = pathServerDirectory;
    }

    public String getDataTime() {
        return dataTime;
    }

    public void setDataTime(String dataTime) {
        this.dataTime = dataTime;
    }

    public List<ResultSurley> getResultSurleyList() {
        return resultSurleyList;
    }

    public void setResultSurleyList(List<ResultSurley> resultSurleyList) {
        this.resultSurleyList = resultSurleyList;
    }

    List<ResultSurley> resultSurleyList;

    FileOutputStream fos;



    public Object reportSystem() {

        Workbook wb = new HSSFWorkbook();
        Sheet sheet = wb.createSheet("Report");

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
        Row row24 = sheet.createRow(24);
        Row row25 = sheet.createRow(25);


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
        cell02.setCellValue("Number_System");
        cell02.setCellStyle(style);

        Cell cell03 = row3.createCell(0);
        cell03.setCellValue("Local_Date_Time");
        cell03.setCellStyle(style);

        Cell cell04 = row4.createCell(0);
        cell04.setCellValue("Ip_Address");
        cell04.setCellStyle(style);

        Cell cell05 = row5.createCell(0);
        cell05.setCellValue("Errored_Blocks_A");
        cell05.setCellStyle(style);

        Cell cell06 = row6.createCell(0);
        cell06.setCellValue("Errored_Blocks_B");
        cell06.setCellStyle(style);

        Cell cell07 = row7.createCell(0);
        cell07.setCellValue("Errored_Seconds_A");
        cell07.setCellStyle(style);

        Cell cell08 = row8.createCell(0);
        cell08.setCellValue("Errored_Seconds_B");
        cell08.setCellStyle(style);

        Cell cell09 = row9.createCell(0);
        cell09.setCellValue("Severely_Errored_Seconds_A");
        cell09.setCellStyle(style);

        Cell cell010 = row10.createCell(0);
        cell010.setCellValue("Severely_Errored_Seconds_B");
        cell010.setCellStyle(style);

        Cell cell011 = row11.createCell(0);
        cell011.setCellValue("Background_Block_Errors_A");
        cell011.setCellStyle(style);

        Cell cell012 = row12.createCell(0);
        cell012.setCellValue("Background_Block_Errors_B");
        cell012.setCellStyle(style);

        Cell cell013 = row13.createCell(0);
        cell013.setCellValue("esr[%]_A");
        cell013.setCellStyle(style);

        Cell cell014 = row14.createCell(0);
        cell014.setCellValue("esr[%]_B");
        cell014.setCellStyle(style);

        Cell cell015 = row15.createCell(0);
        cell015.setCellValue("sers[%]_A");
        cell015.setCellStyle(style);

        Cell cell016 = row16.createCell(0);
        cell016.setCellValue("sers[%]_B");
        cell016.setCellStyle(style);

        Cell cell017 = row17.createCell(0);
        cell017.setCellValue("bber[%]_A");
        cell017.setCellStyle(style);

        Cell cell018 = row18.createCell(0);
        cell018.setCellValue("bber[%]_B");
        cell018.setCellStyle(style);

        Cell cell019 = row19.createCell(0);
        cell019.setCellValue("Available_Time_A");
        cell019.setCellStyle(style);

        Cell cell020 = row20.createCell(0);
        cell020.setCellValue("Available_Time_B");
        cell020.setCellStyle(style);

        Cell cell021 = row21.createCell(0);
        cell021.setCellValue("Unavailable_Time_A");
        cell021.setCellStyle(style);

        Cell cell022 = row22.createCell(0);
        cell022.setCellValue("Unavailable_Time_B");
        cell022.setCellStyle(style);

        Cell cell023 = row23.createCell(0);
        cell023.setCellValue("Nmr_dB_A");
        cell023.setCellStyle(style);

        Cell cell024 = row24.createCell(0);
        cell024.setCellValue("Nmr_dB_B");
        cell024.setCellStyle(style);

        Cell cell025 = row25.createCell(0);
        cell025.setCellValue("Temperature");
        cell025.setCellStyle(style);






        for (int i = 0; i != resultSurleyList.size(); i++) {

            Cell cell1 = row1.createCell(i+1);
            cell1.setCellValue(resultSurleyList.get(i).getId());
            cell1.setCellStyle(style);

            Cell cell2 = row2.createCell(i+1);
            cell2.setCellValue(resultSurleyList.get(i).getNumber());
            cell2.setCellStyle(style);

            Cell cell3 = row3.createCell(i+1);
           // cell3.setCellValue(resultSurleyList.get(i).getLocalDateTime().toString());
            cell3.setCellStyle(style);

            Cell cell4 = row4.createCell(i+1);
            cell4.setCellValue(resultSurleyList.get(i).getIp());
            cell4.setCellStyle(style);


            Cell cell5 = row5.createCell(i+1);
            cell5.setCellValue(resultSurleyList.get(i).getErroredBlocksValueSide1());
            cell5.setCellStyle(style);


            Cell cell6 = row6.createCell(i+1);
            if(resultSurleyList.get(i).getErroredBlocksValueSide2()==null){
                cell6.setCellValue("default");
                cell6.setCellStyle(style);
            }else {
                cell6.setCellValue(resultSurleyList.get(i).getErroredBlocksValueSide2());
                cell6.setCellStyle(style);
            }



            Cell cell7 = row7.createCell(i+1);
            cell7.setCellValue(resultSurleyList.get(i).getErroredSecondValueSide1());
            cell7.setCellStyle(style);


            Cell cell8 = row8.createCell(i+1);
            if(resultSurleyList.get(i).getErroredSecondValueSide2()==null){
                cell8.setCellValue("default");
                cell8.setCellStyle(style);
            }else {
                cell8.setCellValue(resultSurleyList.get(i).getErroredSecondValueSide2());
                cell8.setCellStyle(style);
            }


            Cell cell9 = row9.createCell(i+1);
            cell9.setCellValue(resultSurleyList.get(i).getSeverelyErroredSecondsValueSide1());
            cell9.setCellStyle(style);



            Cell cell10 = row10.createCell(i+1);
            if(resultSurleyList.get(i).getSeverelyErroredSecondsValueSide2()==null){
                cell10.setCellValue("default");
                cell10.setCellStyle(style);
            }else {
                cell10.setCellValue(resultSurleyList.get(i).getSeverelyErroredSecondsValueSide2());
                cell10.setCellStyle(style);
            }


            Cell cell11 = row11.createCell(i+1);
            cell11.setCellValue(resultSurleyList.get(i).getBackgroundBlockErrorsValueSide1());
            cell11.setCellStyle(style);


            Cell cell12 = row12.createCell(i+1);
            if(resultSurleyList.get(i).getBackgroundBlockErrorsValueSide2()==null){
                cell12.setCellValue("default");
                cell12.setCellStyle(style);
            }else {
                cell12.setCellValue(resultSurleyList.get(i).getBackgroundBlockErrorsValueSide2());
                cell12.setCellStyle(style);
            }


            Cell cell13 = row13.createCell(i+1);
            cell13.setCellValue(resultSurleyList.get(i).getEsrValueSide1());
            cell13.setCellStyle(style);


            Cell cell14 = row14.createCell(i+1);
            if(resultSurleyList.get(i).getEsrValueSide2()==null){
                cell14.setCellValue("default");
                cell14.setCellStyle(style);
            }else {
                cell14.setCellValue(resultSurleyList.get(i).getEsrValueSide2());
                cell14.setCellStyle(style);
            }


            Cell cell15 = row15.createCell(i+1);
            if(resultSurleyList.get(i).getSesrValueSide1()==null) {
                cell15.setCellValue("default");
                cell15.setCellStyle(style);

            }else {
                cell15.setCellValue(resultSurleyList.get(i).getSesrValueSide1());
                cell15.setCellStyle(style);
            }


            Cell cell16 = row16.createCell(i+1);
            if(resultSurleyList.get(i).getSesrValueSide2()==null){
                cell16.setCellValue("default");
                cell16.setCellStyle(style);
            }else {
                cell16.setCellValue(resultSurleyList.get(i).getSesrValueSide2());
                cell16.setCellStyle(style);
            }


            Cell cell17 = row17.createCell(i+1);
            cell17.setCellValue(resultSurleyList.get(i).getBberValueSide1());
            cell17.setCellStyle(style);


            Cell cell18 = row18.createCell(i+1);
            if(resultSurleyList.get(i).getBberValueSide2()==null){
                cell18.setCellValue("default");
                cell18.setCellStyle(style);
            }else {
                cell18.setCellValue(resultSurleyList.get(i).getBberValueSide2());
                cell18.setCellStyle(style);
            }

            Cell cell19 = row19.createCell(i+1);
            cell19.setCellValue(resultSurleyList.get(i).getAvailableTimeValueSide1());
            cell19.setCellStyle(style);

            Cell cell20 = row20.createCell(i+1);
            if(resultSurleyList.get(i).getAvailableTimeValueSide2()==null){
                cell20.setCellValue("default");
                cell20.setCellStyle(style);
            }else {
                cell20.setCellValue(resultSurleyList.get(i).getAvailableTimeValueSide2());
                cell20.setCellStyle(style);
            }

            Cell cell21 = row21.createCell(i+1);
            cell21.setCellValue(resultSurleyList.get(i).getUnavailableTimeValueSide1());
            cell21.setCellStyle(style);

            Cell cell22 = row22.createCell(i+1);
            if(resultSurleyList.get(i).getUnavailableTimeValueSide2()==null){
                cell22.setCellValue("default");
                cell22.setCellStyle(style);
            }else {
                cell22.setCellValue(resultSurleyList.get(i).getUnavailableTimeValueSide2());
                cell22.setCellStyle(style);
            }

            Cell cell23 = row23.createCell(i+1);
            cell23.setCellValue(resultSurleyList.get(i).getNmrValueSide1());
            cell23.setCellStyle(style);

            Cell cell24 = row24.createCell(i+1);
            if(resultSurleyList.get(i).getNmrValueSide2()==null){
                cell24.setCellValue("default");
                cell24.setCellStyle(style);
            }else {
                cell24.setCellValue(resultSurleyList.get(i).getNmrValueSide2());
                cell24.setCellStyle(style);
            }

            Cell cell25 = row25.createCell(i+1);
            cell25.setCellValue(resultSurleyList.get(i).getTemperatureValue());
            cell25.setCellStyle(style);

        }



            for (int i = 0; i<=sheet.getRow(1).getPhysicalNumberOfCells(); i++) {
                sheet.autoSizeColumn(i);
            }



            try {
                fos = new FileOutputStream(getPathServerDirectory()+dataTime.replace(':', '-') + ".xls");
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
