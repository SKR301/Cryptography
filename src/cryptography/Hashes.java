package cryptography;

import cryptography.hashes.crc.CRCHashes;
import cryptography.hashes.md.MDHashes;
import cryptography.hashes.ripemd.RIPEMDHashes;
import cryptography.hashes.sha.SHAHashes;
import cryptography.hashes.tiger.TigerHashes;
import cryptography.hashes.whirlpool.WhirlpoolHashes;

public class Hashes {

	public static void main(String[] args) {

		// CRC-8
		System.out.println("CRC-8 hash: " + CRCHashes.crc8("test"));

		// CRC-16
		System.out.println("CRC-16 hash: " + CRCHashes.crc16("test"));

		// CRC-24
		System.out.println("CRC-24 hash: " + CRCHashes.crc24("test"));

		// CRC-32
		System.out.println("CRC-32 hash: " + CRCHashes.crc32("test"));

		// CRC-64
		System.out.println("CRC-64 hash: " + CRCHashes.crc64("testing"));

		// MD-2
		System.out.println("MD-2 hash: " + MDHashes.md2("testing"));

		// MD-4
		System.out.println("MD-4 hash: " + MDHashes.md4("testing"));

		// MD-5
		System.out.println("MD-5 hash: " + MDHashes.md5("testing"));

		// RIPEMD-128
		System.out.println("RIPEMD-128 hash: " + RIPEMDHashes.ripemd128("testing"));

		// RIPEMD-160
		System.out.println("RIPEMD-160 hash: " + RIPEMDHashes.ripemd160("testing"));

		// RIPEMD-256
		System.out.println("RIPEMD-256 hash: " + RIPEMDHashes.ripemd256("testing"));

		// RIPEMD-320
		System.out.println("RIPEMD-320 hash: " + RIPEMDHashes.ripemd320("testing"));

		// SHA-0
		System.out.println("SHA-0 hash: " + SHAHashes.sha0("testing"));

		// SHA-1
		System.out.println("SHA-1 hash: " + SHAHashes.sha1("testing"));
		
		// SHA-224
		System.out.println("SHA-224 hash: " + SHAHashes.sha224("testing"));
		
		// SHA-256
		System.out.println("SHA-256 hash: " + SHAHashes.sha256("testing"));
		
		// SHA-384
		System.out.println("SHA-384 hash: " + SHAHashes.sha384("testing"));
		
		// SHA-512
		System.out.println("SHA-512 hash: " + SHAHashes.sha512("testing"));
		
		// Tiger
		System.out.println("Tiger hash: " + TigerHashes.tiger("testing"));
		
		// Tiger2
		System.out.println("Tiger2 hash: " + TigerHashes.tiger2("testing"));
		
		// Tiger-128
		System.out.println("Tiger-128 hash: " + TigerHashes.tiger128("testing"));
		
		// Tiger-160
		System.out.println("Tiger-160 hash: " + TigerHashes.tiger160("testing"));
		
		// Whirlpool-0
		System.out.println("Whirlpool-0 hash: " + WhirlpoolHashes.whirlpool0("testing"));
	
		// Whirlpool-1
		System.out.println("Whirlpool-1 hash: " + WhirlpoolHashes.whirlpool1("testing"));
		
		// Whirlpool
		System.out.println("Whirlpool hash: " + WhirlpoolHashes.whirlpool("testing"));
		
	}

}
