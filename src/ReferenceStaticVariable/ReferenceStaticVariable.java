package ReferenceStaticVariable;

import java.sql.Ref;

public class ReferenceStaticVariable {
    static String name;
    public ReferenceStaticVariable() {}

    public ReferenceStaticVariable(String name) {
        this.name = name;
    }

    public void checkName() {
        ReferenceStaticVariable reference1 = new ReferenceStaticVariable("kyungmo");
        System.out.println(reference1.name);
        ReferenceStaticVariable reference2 = new ReferenceStaticVariable("gongdeok");
        System.out.println(reference1.name);
        System.out.println(reference2.name);
    }

    public static void main(String[] args) {
        ReferenceStaticVariable reference = new ReferenceStaticVariable();
        reference.checkName();
    }
}
