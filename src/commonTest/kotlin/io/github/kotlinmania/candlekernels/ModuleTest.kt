package io.github.kotlinmania.candlekernels

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class ModuleTest {
    @Test
    fun testAllIdsLengthAndIndexing() {
        assertEquals(11, ALL_IDS.size)
        assertEquals(Id.Affine, ALL_IDS[0])
        assertEquals(Id.Binary, ALL_IDS[1])
        assertEquals(Id.Cast, ALL_IDS[2])
        assertEquals(Id.Conv, ALL_IDS[3])
        assertEquals(Id.Fill, ALL_IDS[4])
        assertEquals(Id.Indexing, ALL_IDS[5])
        assertEquals(Id.Quantized, ALL_IDS[6])
        assertEquals(Id.Reduce, ALL_IDS[7])
        assertEquals(Id.Sort, ALL_IDS[8])
        assertEquals(Id.Ternary, ALL_IDS[9])
        assertEquals(Id.Unary, ALL_IDS[10])

        for (i in ALL_IDS.indices) {
            assertEquals(i, moduleIndex(ALL_IDS[i]))
        }
    }

    @Test
    fun testModuleAccessors() {
        val mod = Module(0, "affine-ptx")
        assertEquals(0, mod.index())
        assertEquals("affine-ptx", mod.ptx())
        assertEquals(mod, Module(0, "affine-ptx"))
        assertNotEquals(mod, Module(1, "affine-ptx"))
        assertNotEquals(mod, Module(0, "other"))
        assertTrue(mod.toString().contains("index=0"))
    }

    @Test
    fun testModuleConstants() {
        assertEquals(0, AFFINE.index())
        assertEquals(1, BINARY.index())
        assertEquals(2, CAST.index())
        assertEquals(3, CONV.index())
        assertEquals(4, FILL.index())
        assertEquals(5, INDEXING.index())
        assertEquals(6, QUANTIZED.index())
        assertEquals(7, REDUCE.index())
        assertEquals(8, SORT.index())
        assertEquals(9, TERNARY.index())
        assertEquals(10, UNARY.index())
    }

    @Test
    fun testPtxConstants() {
        assertEquals(AFFINE.ptx(), io.github.kotlinmania.candlekernels.ptx.AFFINE)
        assertEquals(BINARY.ptx(), io.github.kotlinmania.candlekernels.ptx.BINARY)
        assertEquals(CAST.ptx(), io.github.kotlinmania.candlekernels.ptx.CAST)
        assertEquals(CONV.ptx(), io.github.kotlinmania.candlekernels.ptx.CONV)
        assertEquals(FILL.ptx(), io.github.kotlinmania.candlekernels.ptx.FILL)
        assertEquals(INDEXING.ptx(), io.github.kotlinmania.candlekernels.ptx.INDEXING)
        assertEquals(QUANTIZED.ptx(), io.github.kotlinmania.candlekernels.ptx.QUANTIZED)
        assertEquals(REDUCE.ptx(), io.github.kotlinmania.candlekernels.ptx.REDUCE)
        assertEquals(SORT.ptx(), io.github.kotlinmania.candlekernels.ptx.SORT)
        assertEquals(TERNARY.ptx(), io.github.kotlinmania.candlekernels.ptx.TERNARY)
        assertEquals(UNARY.ptx(), io.github.kotlinmania.candlekernels.ptx.UNARY)
    }
}
