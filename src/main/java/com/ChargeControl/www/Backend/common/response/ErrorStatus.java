package com.ChargeControl.www.Backend.common.response;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)

public enum ErrorStatus {
    /**
     * 400 BAD_REQUEST
     */
    VALIDATION_EXCEPTION("잘못된 요청입니다."),
    VALIDATION_REQUEST_MISSING_EXCEPTION("요청값이 입력되지 않았습니다."),
    NO_TOKEN("토큰을 넣어주세요."),
    INVALID_MEMBER("유효하지 않은 유저입니다."),
    ANOTHER_ACCESS_TOKEN("지원하지 않는 소셜 플랫폼입니다."),
    ALREADY_COMPLETE_ACTIONPLAN("이미 완료된 액션 플랜입니다."),

    /**
     * 401 UNAUTHORIZED
     */
    UNAUTHORIZED_TOKEN("유효하지 않은 토큰입니다."),
    KAKAO_UNAUTHORIZED_USER("카카오 로그인 실패. 만료되었거나 잘못된 카카오 토큰입니다."),
    SIGNIN_REQUIRED("access, refreshToken 모두 만료되었습니다. 재로그인이 필요합니다."),
    VALID_ACCESS_TOKEN("아직 유효한 accessToken 입니다."),
    UNCORRECT_PASSWORD("비밀번호가 일치하지 않습니다."),

    /**
     * 404 NOT_FOUND
     */
    NOT_FOUND_MEMBER("해당하는 유저가 없습니다."),
    NOT_FOUND_MEMBER_CAVE("유저가 생성한 동굴이 없습니다."),
    NOT_FOUND_CAVE("해당하는 동굴이 없습니다."),
    NOT_FOUND_SEED("해당하는 씨앗이 없습니다."),
    NOT_FOUND_ACTIONPLAN("해당하는 액션 플랜이 없습니다."),

    /**
     * 500 SERVER_ERROR
     */
    INTERNAL_SERVER_ERROR("예상치 못한 서버 에러가 발생했습니다."),
    BAD_GATEWAY_EXCEPTION("일시적인 에러가 발생하였습니다.\n잠시 후 다시 시도해주세요!");

    private final String message;

}
