function plusOne(digits: number[]): number[] {
    let num = BigInt(digits.join(''))
    return Array.from((num + BigInt(1)).toString()).map(Number)
};