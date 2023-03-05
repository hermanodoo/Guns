/**
 *
 * methods
 *
 * gunInfo() : what kind of gun is it
 * boxLeft() : ammo left in ammo box
 * ammoLeft() : ammo left in gun
 * reload() : reload teh gun
 * shoot() : shoot the gun
 *
 */
public class Main {
    public static void main(String[] args) {

        ShootTest test = new ShootTest();


        test.gunInfo();


        // testing
        test.boxLeft();
        test.ammoLeft();
        test.reload();
        test.shoot();
        test.shoot();
        test.shoot();
        test.boxLeft();
        test.ammoLeft();


    }


}