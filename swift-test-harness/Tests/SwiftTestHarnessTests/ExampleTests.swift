#if canImport(Testing)
import Testing
import CandleKernels

@Suite("CandleKernels Swift Export Tests")
struct CandleKernelsExportTests {
    @Test("CandleKernels swift module imported cleanly")
    func testSwiftModuleLoads() throws {
        #expect(Bool(true), "CandleKernels swift module imported cleanly")
    }
}
#elseif canImport(XCTest)
import XCTest
import CandleKernels

final class CandleKernelsExportTests: XCTestCase {
    func testSwiftModuleLoads() throws {
        XCTAssertTrue(true, "CandleKernels swift module imported cleanly")
    }
}
#endif
