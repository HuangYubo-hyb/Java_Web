package com.yubo;

import java.time.LocalDate;
import java.time.Period;

public class UserService {

    /**
     * 根据身份证号获取年龄
     * @param idCard 18位身份证号码
     * @return 年龄，如果身份证格式错误返回-1
     */
    public static int getAge(String idCard) {
        if (idCard == null || idCard.length() != 18) {
            return -1;
        }

        try {
            String birthDateStr = idCard.substring(6, 14);
            int year = Integer.parseInt(birthDateStr.substring(0, 4));
            int month = Integer.parseInt(birthDateStr.substring(4, 6));
            int day = Integer.parseInt(birthDateStr.substring(6, 8));

            LocalDate birthDate = LocalDate.of(year, month, day);
            LocalDate currentDate = LocalDate.now();

            return Period.between(birthDate, currentDate).getYears();

        } catch (Exception e) {
            return -1;
        }
    }

    /**
     * 根据身份证号判断性别
     * @param idCard 18位身份证号码
     * @return 性别：1-男，0-女，-1-身份证格式错误
     */
    public static int getGender(String idCard) {
        if (idCard == null || idCard.length() != 18) {
            return -1;
        }

        try {
            // 获取第17位数字（倒数第二位）
            int genderDigit = Character.getNumericValue(idCard.charAt(16));
            // 奇数表示男性，偶数表示女性
            return genderDigit % 2 == 1 ? 1 : 0;

        } catch (Exception e) {
            return -1;
        }
    }
}