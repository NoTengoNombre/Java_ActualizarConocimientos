/**
 * @created on : 31-ago-2017, 19:35:34
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contact {

    private String firstname;
    private String lastname;
    private List<Integer> phoneNumber;
    private Scanner in;

    public Contact() {
        phoneNumber = new ArrayList<>();
        firstname = lastname = "";
        in = new Scanner(System.in);
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public void setFirstName() {
        firstname = in.nextLine();
    }

    public void setLastName() {
        lastname = in.nextLine();
    }

    public void setPhoneNumber() {
        phoneNumber.add(in.nextInt());
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public Integer getPhoneNumber(int position) {
        return phoneNumber.get(position);
    }

    @Override
    public String toString() {
        return getLastName();
    }

}
