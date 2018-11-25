/*
 * This file is a part of moslib.
 * Copyright (c) 2018, Max Roncace <mproncace@gmail.com>
 *
 * The MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package net.caseif.moslib;

public enum AddressingMode {

    /**
     * Immediate.
     */
    IMM(1),
    /**
     * Zero-page.
     */
    ZRP(1),
    /**
     * Zero-page X.
     */
    ZPX(1),
    /**
     * Zero-page Y.
     */
    ZPY(1),
    /**
     * Absolute.
     */
    ABS(2),
    /**
     * Absolute X.
     */
    ABX(2),
    /**
     * Absolute Y.
     */
    ABY(2),
    /**
     * Indirect.
     */
    IND(2),
    /**
     * Indirect X.
     */
    IZX(1),
    /**
     * Indirect Y.
     */
    IZY(1),
    /**
     * Relative.
     */
    REL(1),
    /**
     * Implied.
     */
    IMP(0);

    private final int length;

    AddressingMode(int length) {
        this.length = length;
    }

    public int getOperandLength() {
        return length;
    }

}
