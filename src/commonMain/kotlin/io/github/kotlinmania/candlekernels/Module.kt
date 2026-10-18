package io.github.kotlinmania.candlekernels

public class Module(
    private val index: Int,
    private val ptx: String,
) {
    public fun index(): Int = index

    public fun ptx(): String = ptx

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Module) return false
        return index == other.index && ptx == other.ptx
    }

    override fun hashCode(): Int {
        var result = index.hashCode()
        result = 31 * result + ptx.hashCode()
        return result
    }

    override fun toString(): String = "Module(index=$index, ptx=$ptx)"
}

public val AFFINE: Module = Module(moduleIndex(Id.Affine), io.github.kotlinmania.candlekernels.ptx.AFFINE)
public val BINARY: Module = Module(moduleIndex(Id.Binary), io.github.kotlinmania.candlekernels.ptx.BINARY)
public val CAST: Module = Module(moduleIndex(Id.Cast), io.github.kotlinmania.candlekernels.ptx.CAST)
public val CONV: Module = Module(moduleIndex(Id.Conv), io.github.kotlinmania.candlekernels.ptx.CONV)
public val FILL: Module = Module(moduleIndex(Id.Fill), io.github.kotlinmania.candlekernels.ptx.FILL)
public val INDEXING: Module = Module(moduleIndex(Id.Indexing), io.github.kotlinmania.candlekernels.ptx.INDEXING)
public val QUANTIZED: Module = Module(moduleIndex(Id.Quantized), io.github.kotlinmania.candlekernels.ptx.QUANTIZED)
public val REDUCE: Module = Module(moduleIndex(Id.Reduce), io.github.kotlinmania.candlekernels.ptx.REDUCE)
public val SORT: Module = Module(moduleIndex(Id.Sort), io.github.kotlinmania.candlekernels.ptx.SORT)
public val TERNARY: Module = Module(moduleIndex(Id.Ternary), io.github.kotlinmania.candlekernels.ptx.TERNARY)
public val UNARY: Module = Module(moduleIndex(Id.Unary), io.github.kotlinmania.candlekernels.ptx.UNARY)
