package io.github.kotlinmania.candlekernels

public enum class Id {
    Affine,
    Binary,
    Cast,
    Conv,
    Fill,
    Indexing,
    Quantized,
    Reduce,
    Sort,
    Ternary,
    Unary,
}

public val ALL_IDS: Array<Id> =
    arrayOf(
        Id.Affine,
        Id.Binary,
        Id.Cast,
        Id.Conv,
        Id.Fill,
        Id.Indexing,
        Id.Quantized,
        Id.Reduce,
        Id.Sort,
        Id.Ternary,
        Id.Unary,
    )

public fun moduleIndex(id: Id): Int {
    var i = 0
    while (i < ALL_IDS.size) {
        if (ALL_IDS[i] == id) {
            return i
        }
        i += 1
    }
    throw IllegalArgumentException("id not found")
}
