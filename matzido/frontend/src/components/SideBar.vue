<template>
  <div class="side-bar-wrapper">
    <VueResizable
        class="resizable-side-bar"
        :width="500"
        :min-width="500"
        :max-width="Infinity"
        :active="['r']"
        v-if="isVisibleSideBar"
    >
      <div class="side-bar">
        <div class="title-area">
          <BInput placeholder="맛집 이름을 입력해주세요." />
        </div>
        <div class="image-area">
          <div class="iw-file-input">
            사진을 업로드 해주세요.
          </div>
        </div>
        <div class="location-info-area">
          <BInput placeholder="위치 정보 직접 입력하기" />
        </div>
        <div class="rate-area">
          <BFormRating />
        </div>
        <div class="review-area">
          <BFormTextarea
            ref="textarea"
            placeholer="후기를 입력해주세요."
          />
        </div>
      </div>
    </VueResizable>

    <BButton
        class="side-bar-active-btn"
        size="sm"
        @click="showSideBar"
    >
      {{ isVisibleSideBar ? '닫힘' : '열림' }}
    </BButton>
  </div>
</template>

<script>
import VueResizable from 'vue-resizable';

export default {
  name: 'SideBar',
  components: {
    VueResizable
  },
  data() {
    return {
      isVisibleSideBar: true
    }
  },
  methods: {
    showSideBar() {
      this.isVisibleSideBar = !this.isVisibleSideBar;
    }
  }
}
</script>

<style lang="scss" scoped>
.side-bar-wrapper {
  display: flex;

  > .resizable-side-bar {
    > .side-bar {
      background-color: rgba(0, 0, 0, 0.5);
      position: absolute;
      top: 0;
      left: 0;
      right: 0;
      bottom: 0;
    }
  }

  > .side-bar-active-btn {
    flex-shrink: 0;
    display: flex;
    justify-content: center;
    align-items: center;
    background-color: #000000;
    padding: 0;
    border: none;
    border-radius: unset;
    color: #fff;
    opacity: 0.5;
    width: 40px;
    height: 40px;
  }

  > .side-bar-active-btn:hover {
    cursor: pointer;
  }
}
</style>