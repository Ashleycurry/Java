public class DataTypeDemo {
    /*
        基本数据类型:

                整数
                    byte        1个字节        -128~127
                    short       2个字节
                    int         4个字节
                    long        8个字节
                小数
                    float       4个字节
                    double      8个字节
                字符
                    char        2个字节
                布尔
                    boolean     1个字节

        使用思路:
            整数类型: 首选int, int装不下了, 将类型换成long (定义long类型变量, 需要在数值的后面加入L的标识)
            小数类型: 首选double, 非要定义float类型的变量, 需要在数值后面加入F的标识.

        ---------------------------------------------------------------------

        细节补充:
            所有整数默认都是int
            所有小数默认都是double
            char类型的取值范围是0~65535, char类型的变量可以接收数值, 但是不建议.
     */
    public static void main(String[] args) {
        long tel = 15612341234L;
        double num = 12.3;
        char gender = '男';
        boolean flag = false;

        System.out.println(12345678999L);

        char c = 97;
        System.out.println(c);
    }
}
