import java.io.*;

public class App04 {
    public static void main(String s[]) {

        try {

            String path = "D:\\桌面\\蓝桥\\2021-03-04（视频+代码）\\BIGIMAGE";

            String FileName = "info.dat";

            File file = new File(path);

            file.mkdirs();//创建文件夹

            File fil = new File(path);

            fil.createNewFile();





            FileWriter fileWriter=new FileWriter(path+FileName);

            fileWriter.write("gsmc");//写入文件

            fileWriter.close();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }
    public void writeFile(String result) {
        try {
            String fileName = "E:\\Data.dat";
            File file = new File(fileName);
            File fileParent = file.getParentFile();
            if(!fileParent.exists()){
                fileParent.mkdirs();
            }
            file.createNewFile();
//               false:覆盖之前写的  如果是true则为追加
            BufferedWriter writer = new BufferedWriter (new OutputStreamWriter(new FileOutputStream (file,false),"UTF-8"));
            writer.write(result);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


