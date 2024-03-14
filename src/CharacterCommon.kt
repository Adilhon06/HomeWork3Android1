object CharacterCommon {
    fun attack(character: Character){
        with(character){
            when (character) {
                is Character.Archer -> {
                    println("$name ${character.ability} приминив способность ${weaponType.weaponName}")
                }

                is Character.Mage -> {
                    println("$name ${character.spell} применил заклинание ${weaponType.weaponName}")
                }

                is Character.Warrior -> {
                    println("$name ${character.ability} применил способность ${weaponType.weaponName}")
                }
            }
        }
    }

    fun defend(character: Character){
        with (character) {
            when (character) {
                is Character.Archer -> {
                    println("$name ${character.ability} применив способность ловкость")
                }

                is Character.Mage -> {
                    println("$name ${character.spell} применил заклинание Темный купол")
                }

                is Character.Warrior -> {
                    println("$name ${character.ability} применил способность Отражающий свет клинка")
                }
            }
        }
    }
}