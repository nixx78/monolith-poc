package lv.nixx.poc.monolith.customers;

import lv.nixx.poc.event.IdentifiableAuditEvent;

public record CustomerAuditEvent(String id, String message) implements IdentifiableAuditEvent {
}
