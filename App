public class AppInheritance {
    public static void main(String[] args) throws Exception {
        System.out.println("Wizards and Warlocks Duel");
       
        Wizard Radagaz = new Wizard("Radagaz");
        Warlock Krygo = new Warlock("Krygo");

        Radagaz.superNova(Krygo);
        Krygo.bigFreeze(Radagaz);
        Radagaz.gravityMaelstrom(Krygo);
        Krygo.holdofRib(Radagaz);
        Radagaz.astralSmite(Krygo);
        Krygo.thousandboneLance(Radagaz);
        Radagaz.purifyingLance(Krygo);
        Krygo.realitySlash(Radagaz);
        Radagaz.cureWounds(Radagaz);
        Radagaz.sharkCyclone(Krygo);
        Krygo.brilliantRadiance(Radagaz);
        Radagaz.trueDark(Krygo);

    }
}
