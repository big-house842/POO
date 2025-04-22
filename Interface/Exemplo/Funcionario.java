package Interface.Exemplo;

public class Funcionario {

    String name;
    short rent;

    public Funcionario(String name, short rent) {
        this.name = name;
        this.rent = rent;
    }
    public Funcionario() {
        this.name = null;
        this.rent = 0;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public short getRent() {
        return rent;
    }
    public void setRent(short rent) {
        this.rent = rent;
    }
    
}
