package MYSQL;

public record Client(int client_id, String name, String surname, String email, String registration_date, String tel_number) {

    @Override
    public String toString() {
        return "Client{" +
                "client_id=" + client_id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", registration_date='" + registration_date + '\'' +
                ", tel_number='" + tel_number + '\'' +
                '}';
    }
}
