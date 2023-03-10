public class CTO extends Person {
    public String company;

    public int pegawaiId;

    public CTO(Integer id,String name,String gender,String address,int age,String company,int pegawaiId){
        super(id, name, gender, address, age);
        this.company = company;
        this.pegawaiId = pegawaiId;
    }

    @Override
    public String toString() {
        return "CTO{" +
                "company='" + company + '\'' +
                ", pegawaiId=" + pegawaiId +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
