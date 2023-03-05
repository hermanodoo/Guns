public class ShootTest {

    public ShootTest() {
        System.out.println("read the comments for help");
    }

    Gun gun = new Gun();
    AmmoBox bullet = new AmmoBox();

    String gunInfo = gun.caliber + " caliber " + gun.color + " " + gun.type;
    int inGun = gun.inGun;
    int inBox = bullet.inBox;
    int capacity = gun.capacity;
    int inChamber = gun.inChamber;

    // method for retrieving gun info
    void gunInfo() {
        System.out.println(gunInfo);
    }


    // method for reloading the gun
    void reload() {
        if (inBox > 0) {
            inChamber = 1;
            if (inBox >= capacity) {
                inGun = capacity - 1;
                inBox -= capacity;
                System.out.println("Reloaded");
            } else {
                inGun = inBox - 1;
                inBox = 0;
                System.out.println("Reloaded, No ammo in the ammo box. Buy more ammo.");
            }
        } else {
            System.out.println("No ammo left in the box. Go buy some.");
        }
    }

    // method for checking number of bullets left in the gun
    void ammoLeft() {
        if (inGun == 0) {
            if (inChamber == 0) {
                System.out.println("Not a single bullet left. Please Reload.");
            } else {
                System.out.println("Only a bullet in the chamber.");
            }
        } else {
            System.out.println("There are " + inGun + " left and 1 in the chamber.");
        }
    }

    void boxLeft() {
        if (inBox == 0) {
            System.out.println("No bullets left in the ammo box.");
        } else {
            System.out.println(inBox + " bullets left in the ammo box.");
        }
    }

    // method for shooting the gun
    void shoot() {
        if (inChamber == 1) {
            inChamber -= 1;
            System.out.println("Bang!");
            if (inGun > 0) {
                inGun -= 1;
                inChamber += 1;
            } else {
                System.out.println("Out of ammo. Please reload.");
            }
        } else {
            System.out.println("Not a bullet left even in the chamber.");
        }
    }
}
