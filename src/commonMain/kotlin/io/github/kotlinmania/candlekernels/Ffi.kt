// port-lint: source ffi.rs
package io.github.kotlinmania.candlekernels

public interface Ffi {
    public fun moeGemmWmma(
        input: Long,
        weights: Long,
        sortedTokenIds: Long,
        expertIds: Long,
        topkWeights: Long,
        output: Long,
        expertCounts: Long,
        expertOffsets: Long,
        numExperts: Int,
        topk: Int,
        sizeM: Int,
        sizeN: Int,
        sizeK: Int,
        dtype: Int,
        isPrefill: Boolean,
        stream: Long,
    )

    public fun moeGemmGguf(
        input: Long,
        weights: Long,
        sortedTokenIds: Long,
        expertIds: Long,
        topkWeights: Long,
        output: Long,
        numExperts: Int,
        topk: Int,
        sizeM: Int,
        sizeN: Int,
        sizeK: Int,
        ggufDtype: Int,
        stream: Long,
    )

    public fun moeGemmGgufPrefill(
        input: Long,
        weights: Long,
        sortedTokenIds: Long,
        expertIds: Long,
        topkWeights: Long,
        output: Long,
        numExperts: Int,
        topk: Int,
        sizeM: Int,
        sizeN: Int,
        sizeK: Int,
        inputDtype: Int,
        ggufDtype: Int,
        stream: Long,
    )

    public fun launchMmvqGgufQ40Bf16Plain(
        vx: Long,
        vy: Long,
        dst: Long,
        ncolsX: Int,
        nrowsX: Int,
        strideColY: Int,
        strideColDst: Int,
        bSize: Int,
        stream: Long,
    )

    public fun launchMmvqGgufQ41Bf16Plain(
        vx: Long,
        vy: Long,
        dst: Long,
        ncolsX: Int,
        nrowsX: Int,
        strideColY: Int,
        strideColDst: Int,
        bSize: Int,
        stream: Long,
    )

    public fun launchMmvqGgufQ50Bf16Plain(
        vx: Long,
        vy: Long,
        dst: Long,
        ncolsX: Int,
        nrowsX: Int,
        strideColY: Int,
        strideColDst: Int,
        bSize: Int,
        stream: Long,
    )

    public fun launchMmvqGgufQ51Bf16Plain(
        vx: Long,
        vy: Long,
        dst: Long,
        ncolsX: Int,
        nrowsX: Int,
        strideColY: Int,
        strideColDst: Int,
        bSize: Int,
        stream: Long,
    )

    public fun launchMmvqGgufQ80Bf16Plain(
        vx: Long,
        vy: Long,
        dst: Long,
        ncolsX: Int,
        nrowsX: Int,
        strideColY: Int,
        strideColDst: Int,
        bSize: Int,
        stream: Long,
    )

    public fun launchMmvqGgufQ2KBf16Plain(
        vx: Long,
        vy: Long,
        dst: Long,
        ncolsX: Int,
        nrowsX: Int,
        strideColY: Int,
        strideColDst: Int,
        bSize: Int,
        stream: Long,
    )

    public fun launchMmvqGgufQ3KBf16Plain(
        vx: Long,
        vy: Long,
        dst: Long,
        ncolsX: Int,
        nrowsX: Int,
        strideColY: Int,
        strideColDst: Int,
        bSize: Int,
        stream: Long,
    )

    public fun launchMmvqGgufQ4KBf16Plain(
        vx: Long,
        vy: Long,
        dst: Long,
        ncolsX: Int,
        nrowsX: Int,
        strideColY: Int,
        strideColDst: Int,
        bSize: Int,
        stream: Long,
    )

    public fun launchMmvqGgufQ5KBf16Plain(
        vx: Long,
        vy: Long,
        dst: Long,
        ncolsX: Int,
        nrowsX: Int,
        strideColY: Int,
        strideColDst: Int,
        bSize: Int,
        stream: Long,
    )

    public fun launchMmvqGgufQ6KBf16Plain(
        vx: Long,
        vy: Long,
        dst: Long,
        ncolsX: Int,
        nrowsX: Int,
        strideColY: Int,
        strideColDst: Int,
        bSize: Int,
        stream: Long,
    )

    public fun launchMmvqGgufQ40F32Plain(
        vx: Long,
        vy: Long,
        dst: Long,
        ncolsX: Int,
        nrowsX: Int,
        strideColY: Int,
        strideColDst: Int,
        bSize: Int,
        stream: Long,
    )

    public fun launchMmvqGgufQ41F32Plain(
        vx: Long,
        vy: Long,
        dst: Long,
        ncolsX: Int,
        nrowsX: Int,
        strideColY: Int,
        strideColDst: Int,
        bSize: Int,
        stream: Long,
    )

    public fun launchMmvqGgufQ50F32Plain(
        vx: Long,
        vy: Long,
        dst: Long,
        ncolsX: Int,
        nrowsX: Int,
        strideColY: Int,
        strideColDst: Int,
        bSize: Int,
        stream: Long,
    )

    public fun launchMmvqGgufQ51F32Plain(
        vx: Long,
        vy: Long,
        dst: Long,
        ncolsX: Int,
        nrowsX: Int,
        strideColY: Int,
        strideColDst: Int,
        bSize: Int,
        stream: Long,
    )

    public fun launchMmvqGgufQ80F32Plain(
        vx: Long,
        vy: Long,
        dst: Long,
        ncolsX: Int,
        nrowsX: Int,
        strideColY: Int,
        strideColDst: Int,
        bSize: Int,
        stream: Long,
    )

    public fun launchMmvqGgufQ2KF32Plain(
        vx: Long,
        vy: Long,
        dst: Long,
        ncolsX: Int,
        nrowsX: Int,
        strideColY: Int,
        strideColDst: Int,
        bSize: Int,
        stream: Long,
    )

    public fun launchMmvqGgufQ3KF32Plain(
        vx: Long,
        vy: Long,
        dst: Long,
        ncolsX: Int,
        nrowsX: Int,
        strideColY: Int,
        strideColDst: Int,
        bSize: Int,
        stream: Long,
    )

    public fun launchMmvqGgufQ4KF32Plain(
        vx: Long,
        vy: Long,
        dst: Long,
        ncolsX: Int,
        nrowsX: Int,
        strideColY: Int,
        strideColDst: Int,
        bSize: Int,
        stream: Long,
    )

    public fun launchMmvqGgufQ5KF32Plain(
        vx: Long,
        vy: Long,
        dst: Long,
        ncolsX: Int,
        nrowsX: Int,
        strideColY: Int,
        strideColDst: Int,
        bSize: Int,
        stream: Long,
    )

    public fun launchMmvqGgufQ6KF32Plain(
        vx: Long,
        vy: Long,
        dst: Long,
        ncolsX: Int,
        nrowsX: Int,
        strideColY: Int,
        strideColDst: Int,
        bSize: Int,
        stream: Long,
    )

    public fun launchMmvqGgufQ40F16Plain(
        vx: Long,
        vy: Long,
        dst: Long,
        ncolsX: Int,
        nrowsX: Int,
        strideColY: Int,
        strideColDst: Int,
        bSize: Int,
        stream: Long,
    )

    public fun launchMmvqGgufQ41F16Plain(
        vx: Long,
        vy: Long,
        dst: Long,
        ncolsX: Int,
        nrowsX: Int,
        strideColY: Int,
        strideColDst: Int,
        bSize: Int,
        stream: Long,
    )

    public fun launchMmvqGgufQ50F16Plain(
        vx: Long,
        vy: Long,
        dst: Long,
        ncolsX: Int,
        nrowsX: Int,
        strideColY: Int,
        strideColDst: Int,
        bSize: Int,
        stream: Long,
    )

    public fun launchMmvqGgufQ51F16Plain(
        vx: Long,
        vy: Long,
        dst: Long,
        ncolsX: Int,
        nrowsX: Int,
        strideColY: Int,
        strideColDst: Int,
        bSize: Int,
        stream: Long,
    )

    public fun launchMmvqGgufQ80F16Plain(
        vx: Long,
        vy: Long,
        dst: Long,
        ncolsX: Int,
        nrowsX: Int,
        strideColY: Int,
        strideColDst: Int,
        bSize: Int,
        stream: Long,
    )

    public fun launchMmvqGgufQ2KF16Plain(
        vx: Long,
        vy: Long,
        dst: Long,
        ncolsX: Int,
        nrowsX: Int,
        strideColY: Int,
        strideColDst: Int,
        bSize: Int,
        stream: Long,
    )

    public fun launchMmvqGgufQ3KF16Plain(
        vx: Long,
        vy: Long,
        dst: Long,
        ncolsX: Int,
        nrowsX: Int,
        strideColY: Int,
        strideColDst: Int,
        bSize: Int,
        stream: Long,
    )

    public fun launchMmvqGgufQ4KF16Plain(
        vx: Long,
        vy: Long,
        dst: Long,
        ncolsX: Int,
        nrowsX: Int,
        strideColY: Int,
        strideColDst: Int,
        bSize: Int,
        stream: Long,
    )

    public fun launchMmvqGgufQ5KF16Plain(
        vx: Long,
        vy: Long,
        dst: Long,
        ncolsX: Int,
        nrowsX: Int,
        strideColY: Int,
        strideColDst: Int,
        bSize: Int,
        stream: Long,
    )

    public fun launchMmvqGgufQ6KF16Plain(
        vx: Long,
        vy: Long,
        dst: Long,
        ncolsX: Int,
        nrowsX: Int,
        strideColY: Int,
        strideColDst: Int,
        bSize: Int,
        stream: Long,
    )

    public fun launchMmvqGgufQuantizeQ81Bf16(
        x: Long,
        vy: Long,
        kx: Int,
        kxPadded: Int,
        numRows: Int,
        stream: Long,
    )

    public fun launchMmvqGgufQuantizeQ81F16(
        x: Long,
        vy: Long,
        kx: Int,
        kxPadded: Int,
        numRows: Int,
        stream: Long,
    )

    public fun launchMmvqGgufQuantizeQ81F32(
        x: Long,
        vy: Long,
        kx: Int,
        kxPadded: Int,
        numRows: Int,
        stream: Long,
    )

    public fun launchMmqQuantizeQ81D4(
        x: Long,
        ids: Long,
        vy: Long,
        typeX: Int,
        ne00: Long,
        s01: Long,
        s02: Long,
        s03: Long,
        ne0: Long,
        ne1: Long,
        ne2: Long,
        ne3: Long,
        stream: Long,
    )

    public fun launchMmqQuantizeQ81Ds4(
        x: Long,
        ids: Long,
        vy: Long,
        typeX: Int,
        ne00: Long,
        s01: Long,
        s02: Long,
        s03: Long,
        ne0: Long,
        ne1: Long,
        ne2: Long,
        ne3: Long,
        stream: Long,
    )

    public fun launchMmqQuantizeQ81D2s6(
        x: Long,
        ids: Long,
        vy: Long,
        typeX: Int,
        ne00: Long,
        s01: Long,
        s02: Long,
        s03: Long,
        ne0: Long,
        ne1: Long,
        ne2: Long,
        ne3: Long,
        stream: Long,
    )

    public fun launchMmqGgufQ40(
        tmpFixup: Long,
        x: Long,
        y: Long,
        dst: Long,
        ncolsX: Long,
        nrowsX: Long,
        ncolsY: Long,
        strideRowX: Long,
        strideColDst: Long,
        cc: Int,
        nsm: Int,
        smpbo: Long,
        warpSize: Int,
        stream: Long,
    )

    public fun launchMmqGgufQ41(
        tmpFixup: Long,
        x: Long,
        y: Long,
        dst: Long,
        ncolsX: Long,
        nrowsX: Long,
        ncolsY: Long,
        strideRowX: Long,
        strideColDst: Long,
        cc: Int,
        nsm: Int,
        smpbo: Long,
        warpSize: Int,
        stream: Long,
    )

    public fun launchMmqGgufQ50(
        tmpFixup: Long,
        x: Long,
        y: Long,
        dst: Long,
        ncolsX: Long,
        nrowsX: Long,
        ncolsY: Long,
        strideRowX: Long,
        strideColDst: Long,
        cc: Int,
        nsm: Int,
        smpbo: Long,
        warpSize: Int,
        stream: Long,
    )

    public fun launchMmqGgufQ51(
        tmpFixup: Long,
        x: Long,
        y: Long,
        dst: Long,
        ncolsX: Long,
        nrowsX: Long,
        ncolsY: Long,
        strideRowX: Long,
        strideColDst: Long,
        cc: Int,
        nsm: Int,
        smpbo: Long,
        warpSize: Int,
        stream: Long,
    )

    public fun launchMmqGgufQ80(
        tmpFixup: Long,
        x: Long,
        y: Long,
        dst: Long,
        ncolsX: Long,
        nrowsX: Long,
        ncolsY: Long,
        strideRowX: Long,
        strideColDst: Long,
        cc: Int,
        nsm: Int,
        smpbo: Long,
        warpSize: Int,
        stream: Long,
    )

    public fun launchMmqGgufQ2K(
        tmpFixup: Long,
        x: Long,
        y: Long,
        dst: Long,
        ncolsX: Long,
        nrowsX: Long,
        ncolsY: Long,
        strideRowX: Long,
        strideColDst: Long,
        cc: Int,
        nsm: Int,
        smpbo: Long,
        warpSize: Int,
        stream: Long,
    )

    public fun launchMmqGgufQ3K(
        tmpFixup: Long,
        x: Long,
        y: Long,
        dst: Long,
        ncolsX: Long,
        nrowsX: Long,
        ncolsY: Long,
        strideRowX: Long,
        strideColDst: Long,
        cc: Int,
        nsm: Int,
        smpbo: Long,
        warpSize: Int,
        stream: Long,
    )

    public fun launchMmqGgufQ4K(
        tmpFixup: Long,
        x: Long,
        y: Long,
        dst: Long,
        ncolsX: Long,
        nrowsX: Long,
        ncolsY: Long,
        strideRowX: Long,
        strideColDst: Long,
        cc: Int,
        nsm: Int,
        smpbo: Long,
        warpSize: Int,
        stream: Long,
    )

    public fun launchMmqGgufQ5K(
        tmpFixup: Long,
        x: Long,
        y: Long,
        dst: Long,
        ncolsX: Long,
        nrowsX: Long,
        ncolsY: Long,
        strideRowX: Long,
        strideColDst: Long,
        cc: Int,
        nsm: Int,
        smpbo: Long,
        warpSize: Int,
        stream: Long,
    )

    public fun launchMmqGgufQ6K(
        tmpFixup: Long,
        x: Long,
        y: Long,
        dst: Long,
        ncolsX: Long,
        nrowsX: Long,
        ncolsY: Long,
        strideRowX: Long,
        strideColDst: Long,
        cc: Int,
        nsm: Int,
        smpbo: Long,
        warpSize: Int,
        stream: Long,
    )
}
