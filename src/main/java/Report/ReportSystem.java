package Report;

import Entity.NodeBase;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.*;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
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

        Date date =new Date();
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


        HSSFCellStyle style = ((HSSFWorkbook) wb).createCellStyle();
        style.setAlignment(HorizontalAlignment.CENTER);
        style.setBorderTop(BorderStyle.MEDIUM);
        style.setBorderBottom(BorderStyle.MEDIUM);
        style.setBorderLeft(BorderStyle.MEDIUM);
        style.setBorderRight(BorderStyle.MEDIUM);


        for (int i = 0; i != nodeBaseList.size(); i++) {

            Cell cell1 = row1.createCell(i);
            cell1.setCellValue(nodeBaseList.get(i).getId());
            cell1.setCellStyle(style);

            Cell cell2 = row2.createCell(i);
            cell2.setCellValue(nodeBaseList.get(i).getLocalDateTime().toString());
            cell2.setCellStyle(style);

            Cell cell3 = row3.createCell(i);
            cell3.setCellValue(nodeBaseList.get(i).getIpNode());
            cell3.setCellStyle(style);


            Cell cell4 = row4.createCell(i);
            cell4.setCellValue(nodeBaseList.get(i).getErroredBlocksValueSide1());
            cell4.setCellStyle(style);


            Cell cell5 = row5.createCell(i);
            if(nodeBaseList.get(i).getErroredBlocksValueSide2()==null){
                cell5.setCellValue("default");
                cell5.setCellStyle(style);
            }else {
                cell5.setCellValue(nodeBaseList.get(i).getErroredBlocksValueSide2());
                cell5.setCellStyle(style);
            }



            Cell cell6 = row6.createCell(i);
            cell6.setCellValue(nodeBaseList.get(i).getErroredSecondValueSide1());
            cell6.setCellStyle(style);


            Cell cell7 = row7.createCell(i);
            if(nodeBaseList.get(i).getErroredSecondValueSide2()==null){
                cell7.setCellValue("default");
                cell7.setCellStyle(style);
            }else {
                cell7.setCellValue(nodeBaseList.get(i).getErroredSecondValueSide2());
                cell7.setCellStyle(style);
            }


            Cell cell8 = row8.createCell(i);
            cell8.setCellValue(nodeBaseList.get(i).getSeverelyErroredSecondsValueSide1());
            cell8.setCellStyle(style);



            Cell cell9 = row9.createCell(i);
            if(nodeBaseList.get(i).getSeverelyErroredSecondsValueSide2()==null){
                cell9.setCellValue("default");
                cell9.setCellStyle(style);
            }else {
                cell9.setCellValue(nodeBaseList.get(i).getSeverelyErroredSecondsValueSide2());
                cell9.setCellStyle(style);
            }


            Cell cell10 = row10.createCell(i);
            cell10.setCellValue(nodeBaseList.get(i).getBackgroundBlockErrorsValueSide1());
            cell10.setCellStyle(style);


            Cell cell11 = row11.createCell(i);
            if(nodeBaseList.get(i).getBackgroundBlockErrorsValueSide2()==null){
                cell11.setCellValue("default");
                cell11.setCellStyle(style);
            }else {
                cell11.setCellValue(nodeBaseList.get(i).getBackgroundBlockErrorsValueSide2());
                cell11.setCellStyle(style);
            }


            Cell cell12 = row12.createCell(i);
            cell12.setCellValue(nodeBaseList.get(i).getEsrValueSide1());
            cell12.setCellStyle(style);


            Cell cell13 = row13.createCell(i);
            if(nodeBaseList.get(i).getEsrValueSide2()==null){
                cell13.setCellValue("default");
                cell13.setCellStyle(style);
            }else {
                cell13.setCellValue(nodeBaseList.get(i).getEsrValueSide2());
                cell13.setCellStyle(style);
            }


            Cell cell14 = row14.createCell(i);
            cell14.setCellValue(nodeBaseList.get(i).getSesrValueSide1());
            cell14.setCellStyle(style);


            Cell cell15 = row15.createCell(i);
            if(nodeBaseList.get(i).getSesrValueSide2()==null){
                cell15.setCellValue("default");
                cell15.setCellStyle(style);
            }else {
                cell15.setCellValue(nodeBaseList.get(i).getSesrValueSide2());
                cell15.setCellStyle(style);
            }


            Cell cell16 = row16.createCell(i);
            cell16.setCellValue(nodeBaseList.get(i).getBberValueSide1());
            cell16.setCellStyle(style);


            Cell cell17 = row17.createCell(i);
            if(nodeBaseList.get(i).getBberValueSide2()==null){
                cell17.setCellValue("default");
                cell17.setCellStyle(style);
            }else {
                cell17.setCellValue(nodeBaseList.get(i).getBberValueSide2());
                cell17.setCellStyle(style);
            }

        }






            for (int i = 0; i < sheet.getRow(1).getPhysicalNumberOfCells(); i++) {
                sheet.autoSizeColumn(i);
            }


/*








        Row row3 = sheet.createRow(3);

        Cell cell31 = row3.createCell(1);
        cell31.setCellValue("Errored blocks");
        cell31.setCellStyle(style);

        Cell cell32 = row3.createCell(2);
        cell32.setCellValue(nodeBaseList.get(0).getErroredBlocksValueSide1());
        cell32.setCellStyle(style);

        Cell cell33 = row3.createCell(3);
        cell33.setCellValue(nodeBaseList.get(1).getErroredBlocksValueSide2());
        cell33.setCellStyle(style);

        Cell cell34 = row3.createCell(4);
        cell34.setCellValue(nodeBaseList.get(1).getErroredBlocksValueSide1());
        cell34.setCellStyle(style);

        Cell cell35 = row3.createCell(5);
        cell35.setCellValue(nodeBaseList.get(2).getErroredBlocksValueSide2());
        cell35.setCellStyle(style);

        Cell cell36 = row3.createCell(6);
        cell36.setCellValue(nodeBaseList.get(2).getErroredBlocksValueSide1());
        cell36.setCellStyle(style);

        Cell cell37 = row3.createCell(7);
        cell37.setCellValue(nodeBaseList.get(3).getErroredBlocksValueSide2());
        cell37.setCellStyle(style);

        Cell cell38 = row3.createCell(8);
        cell38.setCellValue(nodeBaseList.get(3).getErroredBlocksValueSide1());
        cell38.setCellStyle(style);

        for (int i=0; i<sheet.getRow(3).getPhysicalNumberOfCells();i++) {
            sheet.autoSizeColumn(i);
        }


        Row row4 = sheet.createRow(4);

        Cell cell41 = row4.createCell(1);
        cell41.setCellValue("Errored seconds");
        cell41.setCellStyle(style);

        Cell cell42 = row4.createCell(2);
        cell42.setCellValue(nodeBaseList.get(0).getErroredSecondValueSide1());
        cell42.setCellStyle(style);

        Cell cell43 = row4.createCell(3);
        cell43.setCellValue(nodeBaseList.get(1).getErroredSecondValueSide2());
        cell43.setCellStyle(style);

        Cell cell44 = row4.createCell(4);
        cell44.setCellValue(nodeBaseList.get(1).getErroredSecondValueSide1());
        cell44.setCellStyle(style);

        Cell cell45 = row4.createCell(5);
        cell45.setCellValue(nodeBaseList.get(2).getErroredSecondValueSide2());
        cell45.setCellStyle(style);

        Cell cell46 = row4.createCell(6);
        cell46.setCellValue(nodeBaseList.get(2).getErroredSecondValueSide1());
        cell46.setCellStyle(style);

        Cell cell47 = row4.createCell(7);
        cell47.setCellValue(nodeBaseList.get(3).getErroredSecondValueSide2());
        cell47.setCellStyle(style);

        Cell cell48 = row4.createCell(8);
        cell48.setCellValue(nodeBaseList.get(3).getErroredSecondValueSide1());
        cell48.setCellStyle(style);

        for (int i=0; i<sheet.getRow(4).getPhysicalNumberOfCells();i++) {
            sheet.autoSizeColumn(i);
        }


        Row row5 = sheet.createRow(5);

        Cell cell51 = row5.createCell(1);
        cell51.setCellValue("Severely errored seconds");
        cell51.setCellStyle(style);

        Cell cell52 = row5.createCell(2);
        cell52.setCellValue(nodeBaseList.get(0).getSeverelyErroredSecondsValueSide1());
        cell52.setCellStyle(style);

        Cell cell53 = row5.createCell(3);
        cell53.setCellValue(nodeBaseList.get(1).getSeverelyErroredSecondsValueSide2());
        cell53.setCellStyle(style);

        Cell cell54 = row5.createCell(4);
        cell54.setCellValue(nodeBaseList.get(1).getSeverelyErroredSecondsValueSide1());
        cell54.setCellStyle(style);

        Cell cell55 = row5.createCell(5);
        cell55.setCellValue(nodeBaseList.get(2).getSeverelyErroredSecondsValueSide2());
        cell55.setCellStyle(style);

        Cell cell56 = row5.createCell(6);
        cell56.setCellValue(nodeBaseList.get(2).getSeverelyErroredSecondsValueSide1());
        cell56.setCellStyle(style);

        Cell cell57 = row5.createCell(7);
        cell57.setCellValue(nodeBaseList.get(3).getSeverelyErroredSecondsValueSide2());
        cell57.setCellStyle(style);

        Cell cell58 = row5.createCell(8);
        cell58.setCellValue(nodeBaseList.get(3).getSeverelyErroredSecondsValueSide1());
        cell58.setCellStyle(style);

        for (int i=0; i<sheet.getRow(5).getPhysicalNumberOfCells();i++) {
            sheet.autoSizeColumn(i);
        }

        Row row6 = sheet.createRow(6);

        Cell cell61 = row6.createCell(1);
        cell61.setCellValue("Background block errors");
        cell61.setCellStyle(style);

        Cell cell62 = row6.createCell(2);
        cell62.setCellValue(nodeBaseList.get(0).getBackgroundBlockErrorsValueSide1());
        cell62.setCellStyle(style);

        Cell cell63 = row6.createCell(3);
        cell63.setCellValue(nodeBaseList.get(1).getBackgroundBlockErrorsValueSide2());
        cell63.setCellStyle(style);

        Cell cell64 = row6.createCell(4);
        cell64.setCellValue(nodeBaseList.get(1).getBackgroundBlockErrorsValueSide1());
        cell64.setCellStyle(style);

        Cell cell65 = row6.createCell(5);
        cell65.setCellValue(nodeBaseList.get(2).getBackgroundBlockErrorsValueSide2());
        cell65.setCellStyle(style);

        Cell cell66 = row6.createCell(6);
        cell66.setCellValue(nodeBaseList.get(2).getBackgroundBlockErrorsValueSide1());
        cell66.setCellStyle(style);

        Cell cell67 = row6.createCell(7);
        cell67.setCellValue(nodeBaseList.get(3).getBackgroundBlockErrorsValueSide2());
        cell67.setCellStyle(style);

        Cell cell68 = row6.createCell(8);
        cell68.setCellValue(nodeBaseList.get(3).getBackgroundBlockErrorsValueSide1());
        cell68.setCellStyle(style);

        for (int i=0; i<sheet.getRow(6).getPhysicalNumberOfCells();i++) {
            sheet.autoSizeColumn(i);
        }


        Row row7 = sheet.createRow(7);

        Cell cell71 = row7.createCell(1);
        cell71.setCellValue("ESR [%]");
        cell71.setCellStyle(style);

        Cell cell72 = row7.createCell(2);
        cell72.setCellValue(nodeBaseList.get(0).getEsrValueSide1());
        cell72.setCellStyle(style);

        Cell cell73 = row7.createCell(3);
        cell73.setCellValue(nodeBaseList.get(1).getEsrValueSide2());
        cell73.setCellStyle(style);

        Cell cell74 = row7.createCell(4);
        cell74.setCellValue(nodeBaseList.get(1).getEsrValueSide1());
        cell74.setCellStyle(style);

        Cell cell75 = row7.createCell(5);
        cell75.setCellValue(nodeBaseList.get(2).getEsrValueSide2());
        cell75.setCellStyle(style);

        Cell cell76 = row7.createCell(6);
        cell76.setCellValue(nodeBaseList.get(2).getEsrValueSide1());
        cell76.setCellStyle(style);

        Cell cell77 = row7.createCell(7);
        cell77.setCellValue(nodeBaseList.get(3).getEsrValueSide2());
        cell77.setCellStyle(style);

        Cell cell78 = row7.createCell(8);
        cell78.setCellValue(nodeBaseList.get(3).getEsrValueSide1());
        cell78.setCellStyle(style);

        for (int i=0; i<sheet.getRow(7).getPhysicalNumberOfCells();i++) {
            sheet.autoSizeColumn(i);
        }


        Row row8 = sheet.createRow(8);

        Cell cell81 = row8.createCell(1);
        cell81.setCellValue("SESR [%]");
        cell81.setCellStyle(style);

        Cell cell82 = row8.createCell(2);
        cell82.setCellValue(nodeBaseList.get(0).getSesrValueSide1());
        cell82.setCellStyle(style);

        Cell cell83 = row8.createCell(3);
        cell83.setCellValue(nodeBaseList.get(1).getSesrValueSide2());
        cell83.setCellStyle(style);

        Cell cell84 = row8.createCell(4);
        cell84.setCellValue(nodeBaseList.get(1).getSesrValueSide1());
        cell84.setCellStyle(style);

        Cell cell85 = row8.createCell(5);
        cell85.setCellValue(nodeBaseList.get(2).getSesrValueSide2());
        cell85.setCellStyle(style);

        Cell cell86 = row8.createCell(6);
        cell86.setCellValue(nodeBaseList.get(2).getSesrValueSide1());
        cell86.setCellStyle(style);

        Cell cell87 = row8.createCell(7);
        cell87.setCellValue(nodeBaseList.get(3).getSesrValueSide2());
        cell87.setCellStyle(style);

        Cell cell88 = row8.createCell(8);
        cell88.setCellValue(nodeBaseList.get(3).getSesrValueSide1());
        cell88.setCellStyle(style);

        for (int i=0; i<sheet.getRow(8).getPhysicalNumberOfCells();i++) {
            sheet.autoSizeColumn(i);
        }



        Row row9 = sheet.createRow(9);

        Cell cell91 = row9.createCell(1);
        cell91.setCellValue("BBER [%]");
        cell91.setCellStyle(style);

        Cell cell92 = row9.createCell(2);
        cell92.setCellValue(nodeBaseList.get(0).getBberValueSide1());
        cell92.setCellStyle(style);

        Cell cell93 = row9.createCell(3);
        cell93.setCellValue(nodeBaseList.get(1).getBberValueSide2());
        cell93.setCellStyle(style);

        Cell cell94 = row9.createCell(4);
        cell94.setCellValue(nodeBaseList.get(1).getBberValueSide1());
        cell94.setCellStyle(style);

        Cell cell95 = row9.createCell(5);
        cell95.setCellValue(nodeBaseList.get(2).getBberValueSide2());
        cell95.setCellStyle(style);

        Cell cell96 = row9.createCell(6);
        cell96.setCellValue(nodeBaseList.get(2).getBberValueSide1());
        cell96.setCellStyle(style);

        Cell cell97 = row9.createCell(7);
        cell97.setCellValue(nodeBaseList.get(3).getBberValueSide2());
        cell97.setCellStyle(style);

        Cell cell98 = row9.createCell(8);
        cell98.setCellValue(nodeBaseList.get(3).getBberValueSide1());
        cell98.setCellStyle(style);

        for (int i=0; i<sheet.getRow(9).getPhysicalNumberOfCells();i++) {
            sheet.autoSizeColumn(i);
        }

        Row row101 = sheet.createRow(10);

        Cell cell101 = row101.createCell(1);
        cell101.setCellValue("Available time");
        cell101.setCellStyle(style);

        Cell cell102 = row101.createCell(2);
        cell102.setCellValue(nodeBaseList.get(0).getAvailableTimeValueSide1());
        cell102.setCellStyle(style);

        Cell cell103 = row101.createCell(3);
        cell103.setCellValue(nodeBaseList.get(1).getAvailableTimeValueSide2());
        cell103.setCellStyle(style);

        Cell cell104 = row101.createCell(4);
        cell104.setCellValue(nodeBaseList.get(1).getAvailableTimeValueSide1());
        cell104.setCellStyle(style);

        Cell cell105 = row101.createCell(5);
        cell105.setCellValue(nodeBaseList.get(2).getAvailableTimeValueSide2());
        cell105.setCellStyle(style);

        Cell cell106 = row101.createCell(6);
        cell106.setCellValue(nodeBaseList.get(2).getAvailableTimeValueSide1());
        cell106.setCellStyle(style);

        Cell cell107 = row101.createCell(7);
        cell107.setCellValue(nodeBaseList.get(3).getAvailableTimeValueSide2());
        cell107.setCellStyle(style);

        Cell cell108 = row101.createCell(8);
        cell108.setCellValue(nodeBaseList.get(3).getAvailableTimeValueSide1());
        cell108.setCellStyle(style);

        for (int i=0; i<sheet.getRow(10).getPhysicalNumberOfCells();i++) {
            sheet.autoSizeColumn(i);
        }


        Row row111 = sheet.createRow(11);

        Cell cell111 = row111.createCell(1);
        cell111.setCellValue("Unavailable time");
        cell111.setCellStyle(style);

        Cell cell112 = row111.createCell(2);
        cell112.setCellValue(nodeBaseList.get(0).getUnavailableTimeValueSide1());
        cell112.setCellStyle(style);

        Cell cell113 = row111.createCell(3);
        cell113.setCellValue(nodeBaseList.get(1).getUnavailableTimeValueSide2());
        cell113.setCellStyle(style);

        Cell cell114 = row111.createCell(4);
        cell114.setCellValue(nodeBaseList.get(1).getUnavailableTimeValueSide1());
        cell114.setCellStyle(style);

        Cell cell115 = row111.createCell(5);
        cell115.setCellValue(nodeBaseList.get(2).getUnavailableTimeValueSide2());
        cell115.setCellStyle(style);

        Cell cell116 = row111.createCell(6);
        cell116.setCellValue(nodeBaseList.get(2).getUnavailableTimeValueSide1());
        cell116.setCellStyle(style);

        Cell cell117 = row111.createCell(7);
        cell117.setCellValue(nodeBaseList.get(3).getUnavailableTimeValueSide2());
        cell117.setCellStyle(style);

        Cell cell118 = row111.createCell(8);
        cell118.setCellValue(nodeBaseList.get(3).getUnavailableTimeValueSide1());
        cell118.setCellStyle(style);

        for (int i=0; i<sheet.getRow(11).getPhysicalNumberOfCells();i++) {
            sheet.autoSizeColumn(i);
        }


        Row row121 = sheet.createRow(12);

        Cell cell121 = row121.createCell(1);
        cell121.setCellValue("NMR");
        cell121.setCellStyle(style);

        Cell cell122 = row121.createCell(2);
        cell122.setCellValue(nodeBaseList.get(0).getNmrValueSide1());
        cell122.setCellStyle(style);

        Cell cell133 = row121.createCell(3);
        cell133.setCellValue(nodeBaseList.get(1).getNmrValueSide2());
        cell133.setCellStyle(style);

        Cell cell144 = row121.createCell(4);
        cell144.setCellValue(nodeBaseList.get(1).getNmrValueSide1());
        cell144.setCellStyle(style);

        Cell cell145 = row121.createCell(5);
        cell145.setCellValue(nodeBaseList.get(2).getNmrValueSide2());
        cell145.setCellStyle(style);

        Cell cell146 = row121.createCell(6);
        cell146.setCellValue(nodeBaseList.get(2).getNmrValueSide1());
        cell146.setCellStyle(style);

        Cell cell147 = row121.createCell(7);
        cell147.setCellValue(nodeBaseList.get(3).getNmrValueSide2());
        cell147.setCellStyle(style);

        Cell cell148 = row121.createCell(8);
        cell148.setCellValue(nodeBaseList.get(3).getNmrValueSide1());
        cell148.setCellStyle(style);

        for (int i=0; i<sheet.getRow(12).getPhysicalNumberOfCells();i++) {
            sheet.autoSizeColumn(i);
        }
*/


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
