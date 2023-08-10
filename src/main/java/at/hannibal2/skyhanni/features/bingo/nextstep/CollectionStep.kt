package at.hannibal2.skyhanni.features.bingo.nextstep

import at.hannibal2.skyhanni.utils.NEUInternalName
import at.hannibal2.skyhanni.utils.NumberUtil

class CollectionStep(collectionName: String, amountNeeded: Int) :
    ProgressionStep(NumberUtil.format(amountNeeded) + " $collectionName Collection", amountNeeded.toLong()) {
    val internalName by lazy { NEUInternalName.fromItemName(collectionName) }
}