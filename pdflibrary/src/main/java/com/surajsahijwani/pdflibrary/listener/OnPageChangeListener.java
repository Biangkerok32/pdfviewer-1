package com.surajsahijwani.pdflibrary.listener;

/**
 * Implements this interface to receive events from IPDFView
 * when a page has changed through swipe
 */
public interface OnPageChangeListener {

    /**
     * Called when the user use swipe to change page
     *
     * @param page      the new page displayed, starting from 1
     * @param pageCount the total page count, starting from 1
     */
    void onPageChanged(int page, int pageCount);

}
