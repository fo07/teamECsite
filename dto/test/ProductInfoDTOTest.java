package com.internousdev.oregon.dto.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.internousdev.oregon.dto.ProductInfoDTO;

public class ProductInfoDTOTest {
	// test getId()
	@Test
	public void test_getId_max() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getId_min() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = -2147483648;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getId_0() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	// test setId()
	@Test
	public void test_setId_max() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setId_min() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = -2147483648;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setId_0() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	// test getProductId()
	@Test
	public void test_getProductId_max() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductId_min() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = -2147483648;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductId_0() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected,actual);
	}

	// test setProductId()
	@Test
	public void test_setProductId_max() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductId_min() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = -2147483648;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductId_0() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected,actual);
	}

	// test getProductName()
	@Test
	public void test_getProductName_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductName_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductName_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductName_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void test_getProductName_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductName_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "123";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductName_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "てすと";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductName_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "テスト";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductName_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductName_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}

	// test setProductName()
	@Test
	public void test_setProductName_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductName_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductName_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductName_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void test_setProductName_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductName_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "123";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductName_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "てすと";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductName_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "テスト";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductName_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductName_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}

	// test getProductNameKana()
	@Test
	public void test_getProductNameKana_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductNameKana_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductNameKana_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductNameKana_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void test_getProductNameKana_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductNameKana_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "123";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductNameKana_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "てすと";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductNameKana_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "テスト";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductNameKana_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductNameKana_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	// test setProductNameKana()
	@Test
	public void test_setProductNameKana_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductNameKana_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductNameKana_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductNameKana_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void test_setProductNameKana_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductNameKana_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "123";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductNameKana_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "てすと";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductNameKana_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "テスト";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductNameKana_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductNameKana_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	// test getProductDescription()
	@Test
	public void test_getProductDescription_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductDescription_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductDescription_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductDescription_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}

	@Test
	public void test_getProductDescription_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductDescription_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "123";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductDescription_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "てすと";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductDescription_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "テスト";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductDescription_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductDescription_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}

	// test setProductDescription()
	@Test
	public void test_setProductDescription_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductDescription_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductDescription_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductDescription_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}

	@Test
	public void test_setProductDescription_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductDescription_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "123";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductDescription_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "てすと";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductDescription_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "テスト";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductDescription_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductDescription_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}

	// test getCategoryId int
	@Test
	public void test_getCategoryId_max() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 2147483647;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getCategoryId_min() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = -2147483648;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getCategoryId_0() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}

	// test setCategoryId()
	@Test
	public void test_setCategoryId_max() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 2147483647;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setCategoryId_min() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = -2147483648;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setCategoryId_0() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}

	// test getPrice()
	@Test
	public void test_getPrice_max() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 2147483647;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getPrice_min() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = -2147483648;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getPrice_0() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}

	// test setPrice()
	@Test
	public void test_setPrice_max() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 2147483647;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setPrice_min() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = -2147483648;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setPrice_0() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}


	// test getImageFilePath()
	@Test
	public void test_getImageFilePath_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFilePath_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFilePath_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFilePath_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void test_getImageFilePath_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFilePath_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "123";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFilePath_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "てすと";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFilePath_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "テスト";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFilePath_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFilePath_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	// test setImageFilePath()
	@Test
	public void test_setImageFilePath_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFilePath_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFilePath_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFilePath_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void test_setImageFilePath_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFilePath_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "123";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFilePath_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "てすと";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFilePath_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "テスト";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFilePath_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFilePath_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	// test getImageFileName()
	@Test
	public void test_getImageFileName_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFileName_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFileName_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFileName_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void test_getImageFileName_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFileName_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "123";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFileName_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "てすと";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFileName_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "テスト";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFileName_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFileName_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}

	// test setImageFileName()
	@Test
	public void test_setImageFileName_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFileName_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFileName_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFileName_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void test_setImageFileName_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFileName_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "123";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFileName_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "てすと";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFileName_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "テスト";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFileName_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFileName_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}

	// test getReleaseDate()
	@Test
	public void test_getReleaseDate_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		Date expected = null;

		dto.setReleaseDate(expected);
		Date actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void test_getReleaseDate_date() {
		ProductInfoDTO dto = new ProductInfoDTO();

		SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected;
		try {
			expected = sdf.parse("20180420 12:00:00");
			dto.setReleaseDate(expected);
			assertEquals(expected, dto.getReleaseDate());
		} catch (ParseException e) {
			fail();
		}
	}

	// test setReleaseDate()
	@Test
	public void test_setReleaseDate_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		Date expected = null;

		dto.setReleaseDate(expected);
		Date actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void test_setReleaseDate_date() {
		ProductInfoDTO dto = new ProductInfoDTO();

		SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected;
		try {
			expected = sdf.parse("20180420 12:00:00");
			dto.setReleaseDate(expected);
			assertEquals(expected, dto.getReleaseDate());
		} catch (ParseException e) {
			fail();
		}
	}

	// test getReleaseCompany()
	@Test
	public void test_getReleaseCompany_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getReleaseCompany_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getReleaseCompany_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getReleaseCompany_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void test_getReleaseCompany_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getReleaseCompany_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "123";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getReleaseCompany_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "てすと";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getReleaseCompany_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "テスト";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getReleaseCompany_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getReleaseCompany_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	// test setReleaseCompany()
	@Test
	public void test_setReleaseCompany_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setReleaseCompany_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setReleaseCompany_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setReleaseCompany_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void test_setReleaseCompany_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setReleaseCompany_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "123";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setReleaseCompany_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "てすと";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setReleaseCompany_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "テスト";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setReleaseCompany_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setReleaseCompany_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

}
