package ch.rasc.sse.eventbus;

import org.springframework.http.MediaType;

public interface MediaTypeAwareDataObjectConverter {

	default boolean supports(SseEvent event, MediaType mediaType) {
		return false;
	}

	default String convert(SseEvent event, MediaType mediaType) {
		return event.toString(); // This is exceedingly dumb
	}
}
