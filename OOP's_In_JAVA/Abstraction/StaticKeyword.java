public class StaticKeyword {
    public static void main(String[] args) {
        School s1 = new School();
        School s2 = new School();
        School s3 = new School();
        s1.setSchoolNm("DCS");
        System.out.println(s1.getSchoolNm());
        System.out.println(s2.getSchoolNm());
        // static school name reference shared to all the variable one change reflects on everyone.
        s3.setSchoolNm("SGRR");
        System.out.println(s3.getSchoolNm());
        System.out.println(s1.getSchoolNm());
        System.out.println(s2.getSchoolNm());
    }
}

class School
{
    int rollNo;
    String name;
    static String Schnm;
    void setSchoolNm(String snm)
    {
        this.Schnm = snm;
    }
    String getSchoolNm()
    {
        return this.Schnm;
    }
}