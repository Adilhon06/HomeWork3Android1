sealed class Character(val name: Text, val weaponType: WeaponType) {
    enum class WeaponType(val weaponName: String) {
        SWORD("Клинок души"),
        STICK("Водяная клетка"),
        BOW("Лединная стрела")
    }
    class Warrior(val ability: String) : Character(WARRIOR, WeaponType.SWORD)
    class Mage(val spell: String) : Character (MAGE, WeaponType.STICK)
    class Archer(val ability: String) : Character (ARCHER, WeaponType.BOW)

    companion object{
        const val WARRIOR = "Гендалф"
        const val MAGE = "Каэль"
        const val ARCHER = "Элейн"
    }
}
